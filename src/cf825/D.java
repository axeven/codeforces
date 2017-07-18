package cf825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String t = br.readLine();
            int[] tp = new int[26];
            int ans = 0;
            for (int i = 0; i < t.length(); ++i) {
                tp[t.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s.length() - t.length() + 1;) {
                //System.out.println("i:" + i);
                int[] ts = new int[26];
                System.arraycopy(tp, 0, ts, 0, 26);
                int slot = 0;
                boolean fail = false;
                for (int j = 0; j < t.length(); ++j) {
                    if (s.charAt(i + j) == '?') {
                        slot++;
                    } else if (--ts[s.charAt(i + j) - 'a'] < 0) {
                        fail = true;
                        break;
                    }
                }
                if (fail) {
                    i++;
                    //System.out.println("fail");
                    continue;
                }
                for (int j = 0; j < ts.length; ++j) {
                    slot -= ts[j];
                }
                if (slot != 0) {
                    //System.out.println("no");
                    i++;
                } else {
                    //System.out.println("yes");
                    String fill = "";
                    for (int j = 0; j < ts.length;) {
                        if (ts[j] > 0) {
                            fill = fill + (char) ('a' + j);
                            ts[j]--;
                        } else {
                            j++;
                        }
                    }
                    for (int j = 0, k = 0; k < t.length() && j < fill.length(); ++k) {
                        if (s.charAt(i + k) == '?') {
                            s = s.substring(0, i + k) + fill.charAt(j) + s.substring(i + k + 1);
                            j++;
                        }
                    }
                    i += t.length();
                    ans++;
                }
            }
            s = s.replace('?', 'a');
            // System.out.println(ans);
            System.out.println(s);
        } catch (IOException ex) {
        }
    }
}
