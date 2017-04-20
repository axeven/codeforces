package cf416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {

    private static int solve(String[] as) {
        int increment = Integer.MAX_VALUE; // if 0 then equal
        int decrement = Integer.MAX_VALUE;
        int last_last_i_pos = -1;
        int last_i_pos = -1; //last i of positive p_i
        int ans = 0;
        int p[] = new int[as.length];
        int diff_log[] = new int[as.length];
        int start_seq = 0;
        for (int i = 0; i < as.length; ++i) {
            p[i] = Integer.parseInt(as[i]);
            //System.out.println("i:" + i);
            if (p[i] == -1) {
                //System.out.println("found -1");
                if (increment == Integer.MAX_VALUE && decrement == Integer.MAX_VALUE) {
                    // any inc or dec but now -1
                    // continue
                } else if (increment != Integer.MAX_VALUE) {
                    // we have specific inc but now -1
                    // continue
                    diff_log[i] = increment;
                    p[i] = p[last_i_pos] + increment;
                } else {
                    // we have specific dec but now -1
                    // coninue
                    diff_log[i] = decrement;
                    if (p[last_i_pos] + decrement * (i - last_i_pos) <= 0) {
                        // if we continue with dec then in here will be less than 1
                        // so we stop the sequence
                        ans++;
                        decrement = Integer.MAX_VALUE;
                        //System.out.println(i + "a");
                        start_seq = i;
                    } else {
                        p[i] = p[last_i_pos] + decrement;
                    }
                }
            } else if (increment == Integer.MAX_VALUE && decrement == Integer.MAX_VALUE) {
                //System.out.println("Not -1 and no seq decided, start: " + start_seq + ", last i: " + last_i_pos);
                // any inc or dec but now non -1
                if (start_seq <= last_i_pos) {
                    //a sequence can be started
                    int diff = p[i] - p[last_i_pos];
                    if (diff % (i - last_i_pos) != 0) {
                        //the sequence must be broken either before of
                        //after last i post
                        ans++;
                        //System.out.println(i + "bb");
                        //this sequence in the middle can have arbitrary inc/dec
                        //but there is a limitation
                        if (p[i] > last_i_pos - last_last_i_pos - 1 || p[i] > i - last_i_pos - 1) {
                            // it is within limit
                        } else {
                            //there must be another sequence either after or
                            //before lasi pos
                            ans++;
                            //System.out.println(i + "bc");
                        }
                        //can not decide anythin on new seq
                        start_seq = i;
                    } else // we have specific inc/dec
                    if (diff < 0) {
                        //we can continue safely
                        decrement = diff;
                        diff_log[i] = decrement;
                    } else {
                        increment = diff / (i - last_i_pos);
                        if (p[last_i_pos] - increment * (last_i_pos - start_seq) > 0) {
                            // no broken
                        } else {
                            ans++;
                            //System.out.println(i + "bd");
                        }
                        diff_log[i] = increment;
                    }
                    //if it is increasing then it may be broken before last i pos
                    //it can also broke after last i pos
                } else {
                    //can not decide, continue
                }
            } else if (increment != Integer.MAX_VALUE) {
                //System.out.println("Not -1 and inc seq: " + increment);
                // we have specific inc but now non -1
                if (p[i] == (i - last_i_pos) * increment + p[last_i_pos]) {
                    // p[i] match the inc, we can continue
                    diff_log[i] = increment;
                } else {
                    // we have to stop the sequence and start a new one
                    ans++;
                    // cant decide the inc/dec of the new sequence 
                    //System.out.println(i + "e " + increment + " " + decrement);
                    increment = Integer.MAX_VALUE;
                    start_seq = i;
                }
            } else {// we have specific dec but now non -1
                //System.out.println("Not -1 and dec seq: " + decrement);
                if (p[i] == (i - last_i_pos) * decrement + p[last_i_pos]) {
                    // p[i] match the inc, we can continue
                    diff_log[i] = decrement;
                } else {
                    // we have to stop the sequence and start a new one
                    ans++;
                    // cant decide the inc/dec of the new sequence 
                    //System.out.println(i + "f");
                    decrement = Integer.MAX_VALUE;
                    start_seq = i;
                }
            }
            if (p[i] != -1) {
                last_last_i_pos = last_i_pos;
                last_i_pos = i;
            }
            ////System.out.println(increment + " " + decrement);
        }
        // close last sequence
        ans += 1;
        //System.out.println("g");
        return ans;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
            String s = br.readLine();
            String as[] = s.split(" ");
            int ans = solve(as);
            for (int i = 0; i < as.length / 2; i++) {
                s = as[i];
                as[i] = as[as.length - i - 1];
                as[as.length - i - 1] = s;
            }
            //System.out.println("--");
            ans = Math.min(ans, solve(as));
            System.out.println(ans);
        } catch (IOException ex) {
        }
    }
}
