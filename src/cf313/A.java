package cf313;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int a = n / 10;
        int b = (n / 100) * 10 + (n % 10);
        System.out.println(Math.max(n, Math.max(a, b)));
    }
}
