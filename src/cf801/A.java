package cf801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            boolean lastv = s.charAt(0) == 'V';
            int[] n = new int[100];
            int idx = 0;
            n[idx] = 1;
            int ans = 0;
            for (int i = 1; i < s.length(); ++i) {
                if ((lastv && s.charAt(i) != 'V') || (!lastv && s.charAt(i) == 'V')) {
                    idx++;
                }
                lastv = s.charAt(i) == 'V';
                n[idx]++;
                if (n[idx] > 2 || (idx == 0 && n[idx] == 2 && !lastv)
                        || (i == s.length() - 1 && n[idx] == 2 && lastv)) {
                    ans = 1;
                }
            }
            if (s.charAt(0) == 'V') {
                idx++;
            }
            ans += idx / 2;
            if (s.length() == 2 && idx == 0) {
                ans = 1;
            }
            System.out.println(ans);
        } catch (IOException ex) {
        }
    }
}
