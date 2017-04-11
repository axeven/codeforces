package cf401;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += sc.nextInt();
        }
        s = Math.abs(s);
        System.out.println((int) Math.ceil(s * 1.0 / x));
    }
}
