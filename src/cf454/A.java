package cf454;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j + (n >> 1)
                        || i < j - (n >> 1)
                        || i < -j + (n >> 1)
                        || i >= -j + (n + (n >> 1))
                        ) {
                    System.out.print("*");
                } else {
                    System.out.print("D");
                }
            }
            System.out.println();
        }
    }
}
