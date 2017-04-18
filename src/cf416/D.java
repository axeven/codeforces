package cf416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
            String s = br.readLine();
            String as[] = s.split(" ");

            int last_diff = Integer.MAX_VALUE;
            int last = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < as.length; ++i) {
                int n = Integer.parseInt(as[i]);
                if (last_diff == Integer.MAX_VALUE) {
                    //no sequence started
                    if (last == Integer.MAX_VALUE) {
                        //trying to start a sequence
                    } else {
                        //starting a sequence
                        last_diff = n - last;
                    }
                } else {
                    //a sequence is already started
                    assert last != Integer.MAX_VALUE;
                    if (n == last + last_diff) {
                        // n belongs to same sequence, continue
                    } else {
                        System.out.println("ended in as " + (i - 1) + ": " + last);
                        // the sequence stop in last, trying to start a new sequence
                        last_diff = Integer.MAX_VALUE;
                        ans += 1;
                    }
                }
                last = n;
            }
            // close last sequence
            ans += 1;
            System.out.println(ans);
        } catch (IOException ex) {
        }
    }
}
