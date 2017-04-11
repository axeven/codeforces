package cf439;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += sc.nextInt();
        }
        s += (n - 1) * 10;
        if (s > d) {
            System.out.println("-1");
        } else {
            System.out.println(((n - 1) * 2 + (d - s) / 5));
        }
    }
}
