package cf339;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String[] as = s.split(" ");
            int n = Integer.parseInt(as[0]);
            int m = Integer.parseInt(as[1]);
            s = br.readLine();
            as = s.split(" ");
            int c = 0;
            int last = 1;
            for (int i = 0; i < m; i++) {
                int a = Integer.parseInt(as[i]);
                if (a < last) {
                    c++;
                }
                last = a;
            }
            long r = (long) c * (long) n + last - 1;
            System.out.println(r);
        } catch (IOException ex) {
        }
    }
}
