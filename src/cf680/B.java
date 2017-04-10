package cf680;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int[] c = new int[Math.max(a, n - a + 1)];
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == 1) {
                c[Math.abs(i + 1 - a)]++;
            }
        }
        int sum = c[0];
        for (int i = 1; i < c.length; i++) {
            if (i < Math.min(a, n - a + 1)) {
                if (c[i] == 2) {
                    sum += 2;
                }
            } else {
                sum += c[i];
            }
        }
        System.out.println(sum);
    }
}
