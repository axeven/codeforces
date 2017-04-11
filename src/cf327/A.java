package cf327;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int s = 0;
                for (int k = 0; k < n; k++) {
                    if (k >= i && k <= j) {
                        s += 1 - b[k];
                    } else {
                        s += b[k];
                    }
                }
                max = Math.max(s, max);
            }
        }
        System.out.println(max);
    }
}
