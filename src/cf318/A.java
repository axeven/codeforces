package cf318;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long half = (n + 1) / 2;
        if (k > half) {
            System.out.println((k - half) * 2);
        } else {
            System.out.println(k * 2 - 1);
        }
    }
}
