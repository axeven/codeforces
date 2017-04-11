package cf378;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 0, q = 0, r = 0;
        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) < Math.abs(b - i)) {
                p++;
            } else if (Math.abs(a - i) == Math.abs(b - i)) {
                q++;
            } else {
                r++;
            }
        }
        System.out.println(p + " " + q + " " + r);
    }
}
