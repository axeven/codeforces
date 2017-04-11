package cf399;


import java.math.BigInteger;
import java.util.Scanner;

public class C {

    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);
        int o = sc.nextInt();
        int x = sc.nextInt();
        int l, r = 0;
        if (o == 0) {
            l = x;
        } else {
            l = (x + 1) / 2;
            r = x / 2;
        }
        BigInteger res = new BigInteger(o + "");
        res = res.pow(2);
        res = res.subtract((new BigInteger(l + "")).pow(2));
        res = res.subtract((new BigInteger(r + "")).pow(2));
        System.out.println(res.toString());
        for (int i = 0; i < l; i++) {
            System.out.print("x");
        }
        for (int i = 0; i < o; i++) {
            System.out.print("o");
        }
        for (int i = 0; i < r; i++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
