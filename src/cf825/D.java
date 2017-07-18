package cf825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class D {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ss = br.readLine();
            String t = br.readLine();
            int ans = 0;
            int[] tp = new int[26];
            for (int i = 0; i < t.length(); ++i) {
                tp[t.charAt(i) - 'a']++;
            }
            int slot = 0;
            int[] sp = new int[26];
            char[] s = ss.toCharArray();
            for (int i = 0; i < s.length; ++i) {
                if (s[i] == '?') {
                    slot++;
                } else {
                    sp[s[i] - 'a']++;
                }
            }
            int f[] = new int[26];
            while (true) {
                boolean fail = false;
                for (int i = 0; i < tp.length; ++i) {
                    sp[i] -= tp[i];
                    //System.out.println("i:" + i + " sp:" + sp[i]);
                    if (sp[i] < 0) {
                        slot += sp[i];
                        if (slot < 0) {
                            fail = true;
                            break;
                        } else {
                            f[i] -= sp[i];
                            sp[i] = 0;
                        }
                    }
                }
                if (fail) {
                    break;
                }
                ans++;
            }
            String fill = "";
            for (int i = 0; i < f.length; i++) {
                char y[] = new char[f[i]];
                Arrays.fill(y, (char)('a' + i));
                String sy = new String(y);
                fill += sy;
            }
            //System.out.println(fill);
            for (int i = 0, j = 0; i < fill.length() && j < s.length; ++j) {
                if (s[j] == '?') {
                    s[j] = fill.charAt(i);
                    i++;
                }
            }
            ss = new String(s);
            ss = ss.replace('?', 'a');

            //System.out.println(ans);
            System.out.println(ss);
        } catch (IOException ex) {
        }
    }
}
