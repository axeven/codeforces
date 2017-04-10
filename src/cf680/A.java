package cf680;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[101];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int b = sc.nextInt();
            a[b]++;
            sum += b;
        }
        int max = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] > 1) {
                if (a[i] >= 3) {
                    max = Math.max(max, 3 * i);
                    break;
                } else {
                    max = Math.max(max, a[i] * i);
                }
            }
        }
        System.out.println(sum - max);
    }
}
