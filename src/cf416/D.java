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
            int ans = 0;
            int p[] = new int[as.length];
            for (int i = 0; i < as.length; ++i) {
                p[i] = Integer.parseInt(as[i]);
                if (last_diff == Integer.MAX_VALUE) {
                    //no sequence started
                    if (i == 0) {
                        //trying to start a sequence
                    } else {
                        //starting a sequence
                        last_diff = p[i] - p[i - 1];
                    }
                } else {
                    //a sequence is already started
                    assert i > 1;
                    if (p[i] == p[i - 1] + last_diff) {
                        // n belongs to same sequence, continue
                    } else {
                        System.out.println("ended in as " + (i - 1) + ": " + p[i - 1]);
                        // the sequence stop in last, trying to start a new sequence
                        last_diff = Integer.MAX_VALUE;
                        ans += 1;
                    }
                }
            }
            // close last sequence
            ans += 1;
            System.out.println(ans);
        } catch (IOException ex) {
        }
    }
}
