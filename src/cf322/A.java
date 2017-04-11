package cf322;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n + m - 1);
        for (int i = 1; i <= n;i++) {
            System.out.println(i + " 1");
        }
        for (int i = 2; i <= m; i++) {
            System.out.println("1 " + i);
        }
    }
}
