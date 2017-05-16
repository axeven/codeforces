package cf794;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C {

    private static String solve(char[] a, char[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        char[] c = new char[a.length];
        for(int i = 0;i < a.length;++i)
            c[i] = '?';
        int s = 0;
        int e = a.length - 1;
        int j1 = 0;
        int j2 = a.length / 2 + (a.length % 2 == 1 ? 1 : 0);
        int k1 = a.length / 2 - (a.length % 2 == 0 ? 1 : 0);
        int k2 = a.length - 1;
        for (int i = 0; i < a.length; ++i) {
            if (i % 2 == 0) {
                //System.out.println(b[k2] +" "+ a[j1] + " " + e + " " + a[k1]);
                if (b[k2] > a[j1]) {
                    c[s] = a[j1];
                    s++;
                    j1++;
                } else {
                    c[e] = a[k1];
                    e--;
                    k1--;
                }
            } else {
                if (a[j1] < b[k2]) {
                    c[s] = b[k2];
                    s++;
                    k2--;
                } else {
                    c[e] = b[j2];
                    e--;
                    j2++;
                }
            }
            //System.out.println(new String(c));
        }
        return new String(c);
    }

    private static String solve1(char[] a, char[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        char[] c = new char[a.length];
        for (int i = 0, j = 0, k = a.length - 1; i < a.length; ++i) {
            if (i % 2 == 0) {
                c[i] = a[j];
                j++;
            } else {
                c[i] = b[k];
                k--;
            }
        }
        return new String(c);
    }

    private static void test(int n) {
        char a[] = new char[n];
        char b[] = new char[n];
        for (int i = 0; i < n; i++) {
            a[i] = 'x';
        }
        for (int i = -1; i < n; i++) {
            if (i >= 0) {
                a[i] = 'a';
            }
            for (int j = 0; j < n; j++) {
                b[j] = 'x';
            }
            for (int k = -1; k < n; k++) {
                if (k >= 0) {
                    b[k] = 'a';
                }
                String x1 = solve1(a, b);
                String x = solve(a, b);
                if (!x.endsWith(x1)) {
                    System.out.println(new String(a));
                    System.out.println(new String(b));
                    System.out.println(x + " " + x1);
                }
            }
        }
    }

    public static void main(String[] args) {
        //test(4);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            char[] a = br.readLine().toCharArray();
            char[] b = br.readLine().toCharArray();
            System.out.println(solve(a, b));
        } catch (IOException ex) {
        }
    }
}


