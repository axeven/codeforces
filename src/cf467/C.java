package cf467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {

    /**
     * This solution is inspired by the solution of user Bidanets @codeforces.com
     * It took me a while to understand it...
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String as[] = s.split(" ");
            int n = Integer.parseInt(as[0]);
            int m = Integer.parseInt(as[1]);
            int k = Integer.parseInt(as[2]);
            s = br.readLine();
            as = s.split(" ");
            int p[] = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                p[i] = Integer.parseInt(as[i - 1]);
            }
            long cumu[] = new long[n + 1];
            for (int i = 1; i <= n; ++i) {
                cumu[i] = cumu[i - 1] + p[i];
            }
            // sum of m consecutive p starting from position i
            long sum_m[] = new long[n + 1];
            for (int i = 1; i <= n - m + 1; ++i) {
                sum_m[i] = cumu[i + m - 1] - cumu[i - 1];
            }
            long mat[][] = new long[k + 1][n + 1];
            for (int added = 1; added <= k; ++added) {
                for (int pos = added * m; pos <= n; ++pos) {
                    mat[added][pos] = mat[added - 1][pos - m] + sum_m[pos - m + 1];
                }
                for (int pos = added * m; pos <= n; ++pos) {
                    mat[added][pos] = Math.max(mat[added][pos - 1], mat[added][pos]);
                }
                //mat[added][pos] contains the max sum of "added" number of sum_m until position "pos"
            }
            System.out.println(mat[k][n]);
        } catch (IOException ex) {
        }
    }
}
