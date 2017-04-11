package cf385;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        int prev = sc.nextInt();
        int now;
        for (int i = 1; i < n; i++) {
            now = sc.nextInt();
            int a = prev - now - c;
            max = Math.max(a, max);
            prev = now;
        }
        System.out.println(max);
    }
}
