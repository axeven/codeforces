package cf296;


import com.sun.corba.se.spi.ior.MakeImmutable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (data.containsKey(a)) {
                data.put(a, data.get(a) + 1);
            } else {
                data.put(a, 1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
            int j = entry.getValue();
            max = Math.max(max, j);
        }
        if (max > (n + 1) / 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
