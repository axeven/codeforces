package cf092;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        for (; m >= i; i++) {
            m -= i;
            i = i == n ? 0 : i;
        }
        System.out.println(m);
    }
}
