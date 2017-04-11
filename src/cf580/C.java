package cf580;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class C {

    private static class v {

        boolean cat;
        ArrayList<v> c = new ArrayList<>();

        public v(boolean cat) {
            this.cat = cat;
        }
    }

    private static int bfs(v node, int currM, int m, v par) {
        if (node.cat) {
            currM++;
        } else {
            currM = 0;
        }
        if (currM > m) {
            return 0;
        } else {
            if (par == null || node.c.size() > 1) {
                int sum = 0;
                for (v ch : node.c) {
                    if (par == null || !ch.equals(par)) {
                        sum += bfs(ch, currM, m, node);
                    }
                }
                return sum;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] as = br.readLine().split(" ");
            int n = Integer.parseInt(as[0]);
            int m = Integer.parseInt(as[1]);
            as = br.readLine().split(" ");
            v[] vs = new v[n + 1];
            for (int i = 0; i < n; i++) {
                if (as[i].equals("1")) {
                    vs[i + 1] = new v(true);
                } else {
                    vs[i + 1] = new v(false);
                }
            }
            for (int i = 0; i < n - 1; i++) {
                as = br.readLine().split(" ");
                vs[Integer.parseInt(as[0])].c.add(vs[Integer.parseInt(as[1])]);
                vs[Integer.parseInt(as[1])].c.add(vs[Integer.parseInt(as[0])]);
            }
            System.out.println(bfs(vs[1], 0, m, null));
        } catch (IOException ex) {

        }
    }

}
