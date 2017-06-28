package cf416;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {

    public static int solve(String[] as) {
        int idx = 0;
        int[] begin = new int[as.length / 2 + 2];
        int[] end = new int[begin.length];
        int[] inc = new int[begin.length];
        int[] parsed = new int[as.length];
        inc[idx] = 1;
        begin[idx] = -1;
        end[idx] = -1;
        idx++;
        begin[idx] = -1;
        inc[idx] = Integer.MAX_VALUE;
        for (int i = 0; i < as.length; ++i) {
            parsed[i] = Integer.parseInt(as[i]);
            if (parsed[i] == -1) {
                if (begin[idx] == -1) {
                    // continue
                } else {
                    if (inc[idx] != Integer.MAX_VALUE) {
                        assert parsed[i - 1] != -1;
                        parsed[i] = parsed[i - 1] + inc[idx];
                        if (parsed[i] < 1) {
                            if (inc[idx] > 0) {
                                // overflow
                                parsed[i] = 0;
                            } else {
                                parsed[i] = -1;
                                end[idx] = i - 1;
                                idx += 1;
                                begin[idx] = -1;
                                inc[idx] = Integer.MAX_VALUE;
                                // all is good
                            }
                        } else {
                            // continue
                        }
                    } else {
                        // continue
                        // 00000000000010000000 cant do anything here
                    }
                }
            } else {
                if (begin[idx] == -1) {
                    // it is not -1 but seq hasn't began so we have to start
                    begin[idx] = i;
                } else {
                    // it is not -1 and seq already began
                    if (inc[idx] != Integer.MAX_VALUE) {
                        if (parsed[i - 1] + inc[idx] == parsed[i]) {
                            // continue
                        } else {
                            end[idx] = i - 1;
                            idx += 1;
                            begin[idx] = i;
                            inc[idx] = Integer.MAX_VALUE;
                            // go
                        }
                    } else {
                        // the inc for this seq hasn't been decided
                        // also check if the -1 buffer can hold the inc
                        if ((parsed[i] - parsed[begin[idx]]) % (i - begin[idx]) == 0) {
                            // we can decide the inc
                            inc[idx] = (parsed[i] - parsed[begin[idx]]) / (i - begin[idx]);
                            if (inc[idx] > 0) {
                                // then check if the prev buffer can hold it
                                if ((begin[idx] - end[idx - 1] - 1) > (parsed[begin[idx]] - 1) / inc[idx]) {
                                    // it can't
                                    begin[idx] = end[idx - 1] + 1;
                                    inc[idx] = 0;
                                    end[idx] = i - 1;
                                    idx++;
                                    begin[idx] = i;
                                    inc[idx] = Integer.MAX_VALUE;
                                } else {
                                    // shift the begin, use up the buffer
                                    parsed[end[idx - 1] + 1] = parsed[begin[idx]] - (begin[idx] - end[idx - 1] + 1) * inc[idx];
                                    begin[idx] = end[idx - 1] + 1;
                                }
                            } // otherwise it can always hold
                        } else {
                            // we can not decide the inc, we must break the buffer instead
                            // the case 0000000100000 can not be decided directly
                            // update, the case above, we set inc = 0
                            //         that seems to be the best solution
                            //         other inc value may introduce new seq
                            inc[idx] = 0;
                            parsed[end[idx - 1] + 1] = parsed[begin[idx]] + begin[idx] - end[idx - 1] - 1;;
                            begin[idx] = end[idx - 1] + 1;
                            end[idx] = i - 1;
                            idx++;
                            begin[idx] = i;
                            inc[idx] = Integer.MAX_VALUE;
                        }
                    }
                }

            }
        }
        if (end[idx] < 1) {
            if (inc[idx] != Integer.MAX_VALUE) {
                end[idx] = as.length - 1;
            } else {
                if (begin[idx] == -1) {
                    begin[idx] = 0;
                    end[idx] = as.length - 1;
                } else if (parsed[begin[idx]] >= begin[idx] - end[idx - 1]) {
                    inc[idx] = 1;
                    parsed[end[idx - 1] + 1] = parsed[begin[idx]] - begin[idx] + end[idx - 1] + 1;
                    begin[idx] = end[idx - 1] + 1;
                    end[idx] = as.length - 1;
                } else {
                    inc[idx] = 0;
                    parsed[end[idx - 1] + 1] = parsed[begin[idx]] + begin[idx] - end[idx - 1] - 1;
                    end[idx] = as.length - 1;
                    begin[idx] = end[idx - 1] + 1;
                }
            }
        }
        return idx;
    }
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
            String s = br.readLine();
            String as[] = s.split(" ");
            System.out.println(solve(as));
        } catch (IOException ex) {
        }
    }
}
