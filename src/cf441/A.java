package cf441;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try {
            line = br.readLine();
            String[] as = line.split(" ");
            int k = Integer.parseInt(as[0]);
            int v = Integer.parseInt(as[1]);
            int count = 0;
            String s = "";
            for (int i = 0; i < k; i++) {
                line = br.readLine();
                as = line.split(" ");
                for (int j = 1; j < as.length; j++) {
                    if (Integer.parseInt(as[j]) < v) {
                        s += " " + (i + 1);
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
            if (s.length() > 0) {
                System.out.println(s.substring(1));
            } else {
                System.out.println();
            }
        } catch (IOException ex) {
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                }
            }
        }
    }
}
