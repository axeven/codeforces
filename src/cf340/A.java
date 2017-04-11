package cf340;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        x = x * y  / fpb(x, y);
        int a = sc.nextInt();
        int aa = a / x;
        if (a % x > 0) {
            aa++;
        }
        int b = sc.nextInt() / x;
        System.out.println(b - aa + 1);
    }

    public static int fpb(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return fpb(b, a % b);
        }
    }
}
