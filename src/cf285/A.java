package cf285;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int index = 0;
        for (int i = 0; i < k; i++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(n - i);
            index++;
        }
        for (int i = k, j = 1; i < n; i++, j++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(j);
            index++;
        }
        System.out.println();
    }
}
