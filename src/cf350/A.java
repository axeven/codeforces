package cf350;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int minA = Integer.MAX_VALUE;
        int maxA = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            minA = Math.min(minA, t);
            maxA = Math.max(maxA, t);
        }
        int minB = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            minB = Math.min(minB, t);
        }
        if (maxA >= minB || 2 * minA >= minB) {
            System.out.println("-1");
        } else {
            System.out.println(Math.max(2 * minA, maxA));
        }
    }
}
