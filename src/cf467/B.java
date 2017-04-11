package cf467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String as[] = s.split(" ");
            int n = Integer.parseInt(as[0]);
            int m = Integer.parseInt(as[1]);
            int k = Integer.parseInt(as[2]);
            int[] x = new int[m];
            int friend = 0;
            for (int i = 0; i < m; i++) {
                x[i] = Integer.parseInt(br.readLine());
            }
            int xx = Integer.parseInt(br.readLine());
            int one = 0x1;
            int[] diff = new int[m];
            for (int i = 0; i <= 20; i++) {
                for(int j = 0 ; j < m;j++){
                    if(((xx + x[j]) & one) != 0){
                        diff[j]++;
                    }
                    x[j] = x[j] >> 1;
                }
                xx  = xx>> 1;
            }
            for(int i = 0; i < m ; i ++){
                if(diff[i] <= k){
                    friend++;
                }
            }
            System.out.println(friend);
        } catch (IOException ex) {
        }
    }
}
