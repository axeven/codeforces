package cf002;


import java.util.*;

public class A {

    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        String[] input = new String[n];
        String win = "";
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextLine();
            String[] as = input[i].split(" ");
            String s = as[0];
            int a = Integer.parseInt(as[1]);
            if (data.containsKey(s)) {
                int b = data.get(s);
                b += a;
                data.put(s, b);
            } else {
                data.put(s, a);
            }
        }
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            String s = entry.getKey();
            int a = entry.getValue();
            if (a > max) {
                win = s;
                max = a;
            }
        }
        ArrayList<String> winners = new ArrayList<>();
        Collection<Integer> v = data.values();
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            String s = entry.getKey();
            int a = entry.getValue();
            if (a == max) {
                winners.add(s);
            }
        }
        if (winners.size() == 1) {
            System.out.println(win);
        } else {
            data = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String[] as = input[i].split(" ");
                String s = as[0];
                int a = Integer.parseInt(as[1]);
                if (winners.contains(s)) {
                    if (data.containsKey(s)) {
                        int b = data.get(s);
                        b += a;
                        data.put(s, b);
                    } else {
                        data.put(s, a);
                    }
                    if(data.get(s) >= max){
                        System.out.println(s);
                        return;
                    }
                }
            }
        }
    }
}
