package cf408;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k[i]; j++) {
                int a = sc.nextInt();
                t[i] += a * 5 + 15;
            }
            min = Math.min(min, t[i]);
        }
        System.out.println(min);
    }
}
