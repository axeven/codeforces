package cf580;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B {

    private static class f implements Comparable<f> {

        int m;
        int s;

        public f(int m, int s) {
            this.m = m;
            this.s = s;
        }

        @Override
        public int compareTo(f o) {
            f other = (f) o;
            if (m < other.m) {
                return -1;
            } else if (m == other.m) {
                return 0;
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String[] as = s.split(" ");
            int n = Integer.parseInt(as[0]);
            int d = Integer.parseInt(as[1]);
            f[] friends = new f[n];
            for (int i = 0; i < n; i++) {
                s = br.readLine();
                as = s.split(" ");
                friends[i] = new f(Integer.parseInt(as[0]), Integer.parseInt(as[1]));
            }
            Arrays.sort(friends);
            int lastEnd = 0, end = 0;
            long sum = friends[0].s;
            long max = 0;
            for(int i = 0; i < n;i++){
                for (end = lastEnd + 1; end < n; end++) {
                    if(friends[end].m - friends[i].m >= d){
                        break;
                    }
                    sum += friends[end].s;
                }
                if(sum > max){
                    max = sum;
                }
                sum -= friends[i].s;
                lastEnd = end - 1;
            }
            System.out.println(max);
        } catch (IOException ex) {

        }
    }

}
