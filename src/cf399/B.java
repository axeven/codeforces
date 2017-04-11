package cf399;

import java.math.BigInteger;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        BigInteger satu = new BigInteger("1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        BigInteger res = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'B') {
                BigInteger x = satu.shiftLeft(i);
                res = res.add(x);
            }
        }
        System.out.println(res.toString());
    }
}
