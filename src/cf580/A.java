package cf580;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = 0;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            if (a < m) {
                if (x > max) {
                    max = x;
                }
                x = 1;
            } else {
                x++;
            }
            m = a;
        }
        if (x > max) {
            max = x;
        }
        System.out.println(max);
    }

}
