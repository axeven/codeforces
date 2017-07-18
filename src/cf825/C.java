package cf825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class C {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String as[] = s.split(" ");
            int n = Integer.parseInt(as[0]);
            long k = Long.parseLong(as[1]);
            s = br.readLine();
            as = s.split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(as[i]);
            }
            Arrays.sort(a);
            int ans = 0;
            for (int i = 0; i < n; ++i) {
                if (2 * k < a[i]) {
                    // need to solve from judge
                    while(2 * k < a[i]){
                        ans++;
                        k = 2*k;
                    }
                }
                if (a[i] > k) {
                    k = a[i];
                }
            }
            System.out.println(ans);
        } catch (IOException ex) {
        }
    }
}
