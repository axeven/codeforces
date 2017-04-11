package cf237;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = br.readLine();
            int n = Integer.parseInt(line);
            String last = "";
            int a = 0, b = 0;
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                if(line.equals(last)){
                    b++;
                }else{
                    a = Math.max(a, b);
                    b = 1;
                }
                last = line;
            }
            a = Math.max(a, b);
            System.out.println(a);
        } catch (IOException ex) {
        }
    }
}
