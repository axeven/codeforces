package cf037;


import java.util.HashMap;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int val;
            if (!map.containsKey(a)) {
                val = 1;
            } else {
                val = map.get(a) + 1;
            }
            map.put(a, val);
            max = Math.max(max, val);
        }
        System.out.println(max + " " + map.size());
    }
}
