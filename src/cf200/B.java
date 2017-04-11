package cf200;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        for (int i = 0; i < n; i++) {
            p += sc.nextInt();
        }
        System.out.println(p * 1.0d / (100 * n) * 100);
    }
}
