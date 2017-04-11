package cf379;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int r = n;
        while (n / b > 0) {
            int m = n / b;
            r += m;
            n = m + (n % b);
        }
        System.out.println(r);
    }
}
