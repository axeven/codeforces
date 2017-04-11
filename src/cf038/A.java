package cf038;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n - 1];
        for (int i = 0; i < d.length; i++) {
            d[i]= sc.nextInt();
        }
        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;
        int y = 0;
        for (int i = a; i < b; i++) {
            y += d[i];
        }
        System.out.println(y);
    }
}
