package cf519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author lathif
 */
public class B {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            String as[] = s.split(" ");
            int[] x1 = new int[n];
            for (int i = 0; i < n; i++) {
                x1[i] = Integer.parseInt(as[i]);
            }
            Arrays.sort(x1);
            s = br.readLine();
            as = s.split(" ");
            int[] x2 = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                x2[i] = Integer.parseInt(as[i]);
            }
            Arrays.sort(x2);
            s = br.readLine();
            as = s.split(" ");
            int[] x3 = new int[n - 2];
            for (int i = 0; i < n - 2; i++) {
                x3[i] = Integer.parseInt(as[i]);
            }
            Arrays.sort(x3);
            int b = 0;
            int e = n - 1;
            int m;
            int a1 = 0, a2 = 0;
            while (true) {
                m = (b + e) / 2;
                if (x1[m] == x2[m]) {
                    b = m;
                    if (m == n - 2) {
                        a1 = x1[m + 1];
                        break;
                    }
                    if (x1[m + 1] != x2[m + 1]) {
                        a1 = x1[m + 1];
                        break;
                    }
                } else {
                    e = m;
                    if (m == 0 || x1[m - 1] != x2[m - 1]) {
                        a1 = x1[m];
                        break;
                    }
                }
            }
            b = 0;
            e = n - 2;
            while (true) {
                m = (b + e) / 2;
                if (x3[m] == x2[m]) {
                    b = m;
                    if (m == n - 3) {
                        a2 = x2[m + 1];
                        break;
                    }
                    if (x3[m + 1] != x2[m + 1]) {
                        a2 = x2[m + 1];
                    }
                } else {
                    e = m;
                    if (m == 0 || x3[m - 1] != x2[m - 1]) {
                        a2 = x2[m];
                        break;
                    }
                }
            }
            System.out.println(a1);
            System.out.println(a2);
        } catch (IOException ex) {
        }
    }
}
