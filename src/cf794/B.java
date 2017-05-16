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
            
//            h1/h = x1/0.5;
//            x1 = 0.5 * h1/h;
//            b1 = 2 * x1= h1/h;
//            a1 = 0.5*b1*h1 = 0.5 *h1*h1/h;
//            h1*h1 = a1 * h / 0.5= 2 * a1 * h;
//            a1 = i * unit = i * 0.5 * h / n;
//            h1*h1=2 * i * 0.5 * h * h / n
        } catch (IOException ex) {

        }
    }
}
