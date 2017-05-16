package cf794;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = br.readLine();
            String as[] = s.split(" ");
            int a = Integer.parseInt(as[0]);
            int b = Integer.parseInt(as[1]);
            int c = Integer.parseInt(as[2]);
            br.readLine();
            s = br.readLine();
            as = s.split(" ");
            int d;
            long ans = 0;
            for (int i = 0; i < as.length; ++i) {
                d = Integer.parseInt(as[i]);
                if(d > b && d < c){
                    ans++;
                }
            }
            System.out.println(ans);
        } catch (IOException ex) {

        }
    }
}
