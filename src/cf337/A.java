package cf337;


import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();
        int m = sc.nextInt();
        int[] f = new int[m];
        for (int i = 0; i < m; i++) {
            f[i] = sc.nextInt();
        }
        Arrays.sort(f);
        int[] start = new int[m];
        int[] end = new int[m];
        for (int i = 0; i < m; i++) {
            start[i] = i;
            end[i] = i;
            //System.out.print(f[i] + " ");
        }
        //System.out.println();
        for (int i = 1; i < n; i++) {
            int dmin = Integer.MAX_VALUE;
            //System.out.println(i + " ===");
            for (int j = 0; j < m; j++) {
                int cmin;
                int left = Integer.MAX_VALUE;
                //System.out.println(end[j] + " " + start[j]);
                if (start[j] > 0) {
                    left = f[end[j]] - f[start[j] - 1];
                }
                int right = Integer.MAX_VALUE;
                if (end[j] < m - 1) {
                    right = f[end[j] + 1] - f[start[j]];
                }
                if (left < right) {
                    start[j]--;
                    cmin = left;
                } else {
                    end[j]++;
                    cmin = right;
                }
                //System.out.println(end[j] + " " + start[j] + " " + cmin);
                dmin = Math.min(dmin, cmin);
            }
            if (i == n - 1) {
                System.out.println(dmin);
            }
        }
    }
}
