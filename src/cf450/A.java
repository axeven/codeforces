package cf450;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        int last = 0;
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            a = (int) Math.ceil(a * 1.0 / m);
            if (a >= max) {
                last = i;
                max = a;
            }
        }
        System.out.println(last);
    }
}
