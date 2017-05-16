package cf794;

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
            int h = Integer.parseInt(as[1]);
            for (int i = 1; i < n; ++i) {
                if(i > 1)
                    System.out.print(" ");
                System.out.print(h * Math.sqrt(i * 1.0/ n));
            }
        } catch (IOException ex) {

        }
    }
}
