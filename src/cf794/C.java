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

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            char[] a = br.readLine().toCharArray();
            char[] b = br.readLine().toCharArray();
            System.out.println(solve(a, b));
        } catch (IOException ex) {
        }
    }
}


