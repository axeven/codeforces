package cf408;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class D {

    public static void main(String[] args) {
        try {
            int x = 1000000007;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            int n = Integer.parseInt(s);
            s = br.readLine();
            String[] as = s.split(" ");
            int[] p = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(as[i - 1]);
            }
            int[] r = new int[n + 1];
            for (int i = n; i > 0; i--) {
                r[i] = 1;
            }
            for (int i = n; i > 0; i--) {
                for (int j = p[i]; j < i; j++) {
                    r[j] += r[i];
                    r[j] %= x;
                }
            }
            int o = 0;
            for (int i = 1; i <= n; i++) {
                o += r[i];
                o %= x;
            }
            o = (o << 1) % x;
            System.out.println(o);
        } catch (IOException ex) {
        }
    }
}
