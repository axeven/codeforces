package cf680;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class E {

    private static class Coord {

        int r, c;

        public Coord(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public int hashCode() {
            return r * 501 + c;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Coord) {
                return hashCode() == ((Coord) obj).hashCode();
            }
            return false;
        }
    }

    private static void mark_comp(String[] map, int[][] idx, int i, int j, int mark, ArrayList<HashSet<Coord>> comps) {
        idx[i][j] = mark;
        HashSet<Coord> com;
        if (mark - 1 >= comps.size()) {
            com = new HashSet<>();
            comps.add(com);
        } else {
            com = comps.get(mark - 1);
        }
        com.add(new Coord(i, j));
        if (i > 0 && idx[i - 1][j] != mark && map[i - 1].charAt(j) == '.') {
            mark_comp(map, idx, i - 1, j, mark, comps);
        }
        if (i + 1 < map.length && map[i + 1].charAt(j) == '.' && idx[i + 1][j] != mark) {
            mark_comp(map, idx, i + 1, j, mark, comps);
        }
        if (j > 0 && idx[i][j - 1] != mark && map[i].charAt(j - 1) == '.') {
            mark_comp(map, idx, i, j - 1, mark, comps);
        }
        if (j + 1 < map[0].length() && map[i].charAt(j + 1) == '.' && idx[i][j + 1] != mark) {
            mark_comp(map, idx, i, j + 1, mark, comps);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] map = new String[n];
        for (int i = 0; i < n; i++) {
            map[i] = sc.nextLine();
        }
        ArrayList<HashSet<Coord>> comps = new ArrayList<HashSet<Coord>>();
        int[][] idx = new int[n][n];
        int cur_idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (idx[i][j] == 0 && map[i].charAt(j) == '.') {
                    mark_comp(map, idx, i, j, ++cur_idx, comps);
                }
            }
        }
        int max = 0;
        HashSet<Coord> added = new HashSet<Coord>();
        ArrayList<Coord> stack = new ArrayList<Coord>();
        Coord max_coord = new Coord(0, 0);
        HashSet<Coord> added_max = new HashSet<Coord>();
        for (int i = 0; i < n - k + 1; i++) {
            for (int j = 0; j < n - k + 1; j++) {
                int curr = k * k;
                added.clear();
                stack.clear();
                for (int l = 0; l < k; l++) {
                    for (int m = 0; m < k; m++) {
                        Coord c = new Coord(i + l, j + m);
                        added.add(c);
                        if (l == 0 || l == k - 1 || m == 0 || m == k - 1) {
                            stack.add(c);
                        }
                    }
                }
                while (!stack.isEmpty()) {
                    Coord c = stack.get(stack.size() - 1);
                    stack.remove(stack.size() - 1);
                    if (c.r > 0) {
                        if (idx[c.r - 1][c.c] > 0) {
                            HashSet<Coord> com = comps.get(idx[c.r - 1][c.c] - 1);
                            for (Iterator<Coord> it = com.iterator(); it.hasNext();) {
                                Coord next = it.next();
                                if (!added.contains(next)) {
                                    curr++;
                                    added.add(next);
                                }
                            }
                        }
                    }
                    if (c.r + 1 < n) {
                        if (idx[c.r + 1][c.c] > 0) {
                            HashSet<Coord> com = comps.get(idx[c.r + 1][c.c] - 1);
                            for (Iterator<Coord> it = com.iterator(); it.hasNext();) {
                                Coord next = it.next();
                                if (!added.contains(next)) {
                                    curr++;
                                    added.add(next);
                                }

                            }
                        }
                    }
                    if (c.c > 0) {
                        if (idx[c.r][c.c - 1] > 0) {
                            HashSet<Coord> com = comps.get(idx[c.r][c.c - 1] - 1);
                            for (Iterator<Coord> it = com.iterator(); it.hasNext();) {
                                Coord next = it.next();
                                if (!added.contains(next)) {
                                    curr++;
                                    added.add(next);
                                }

                            }
                        }
                    }
                    if (c.c + 1 < n) {
                        if (idx[c.r][c.c + 1] > 0) {
                            HashSet<Coord> com = comps.get(idx[c.r][c.c + 1] - 1);
                            for (Iterator<Coord> it = com.iterator(); it.hasNext();) {
                                Coord next = it.next();
                                if (!added.contains(next)) {
                                    curr++;
                                    added.add(next);

                                }
                            }
                        }
                    }
                }
                if (curr > max) {
                    max_coord = new Coord(i, j);
                    added_max.clear();
                    added_max.addAll(added);
                }
                max = Math.max(max, curr);
            }
        }
        System.out.println(max);
//        for (int i = 0; i < comps.size(); ++i) {
//            System.out.println((i + 1) + " " + comps.get(i).size());
//        }
//        for (int i = 0; i < idx.length; i++) {
//            for (int j = 0; j < idx[i].length; j++) {
//                if (added_max.contains(new Coord(i, j))) {
//                    System.out.print(".");
//                } else {
//                    System.out.print(Integer.toHexString(idx[i][j]));
//                }
//            }
//            System.out.println();
//        }
    }
}
