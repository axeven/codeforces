package cf384;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int a = (n + 1) / 2;
        int b = n / 2;
        int r = a * a + b * b;
        System.out.println(r);
        String s = "";
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                s += '.';
            } else {
                s += "C";
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(s.substring(1));
            } else {
                System.out.println(s.substring(0, s.length() - 1));
            }
        }
    }
}
