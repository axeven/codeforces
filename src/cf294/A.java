package cf294;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt();
            if (x > 0) {
                a[x - 1] += y - 1;
            }
            if (x < n - 1) {
                a[x + 1] += a[x] - y;
            }
            a[x] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
