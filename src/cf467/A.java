package cf467;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int n = Integer.parseInt(s);
            int sum = 0;
            String as[];
            for (int i = 0; i < n; ++i) {
                s = br.readLine();
                as = s.split(" ");
                if (Integer.parseInt(as[1]) - Integer.parseInt(as[0]) > 1) {
                    sum++;
                }
            }
            System.out.println(sum);
        } catch (IOException ex) {
        }
    }
}
