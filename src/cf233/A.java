package cf233;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        if (n % 2 == 1) {
            System.out.println("-1");
        } else {
            for (int i = 1; i <= n; i += 2) {
                if (i > 1) {
                    System.out.print(" ");
                }
                System.out.print(i + 1);
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
