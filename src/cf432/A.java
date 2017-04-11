package cf432;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int lim = 5;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (lim - sc.nextInt() >= k) {
                s++;
            }
        }
        System.out.println(s / 3);
    }
}
