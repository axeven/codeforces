package cf801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = br.readLine();
            String b = br.readLine();
            for (int i = 0; i < a.length(); ++i) {
                if(b.charAt(i) > a.charAt(i)){
                    System.out.println("-1");
                    return;
                }
            }
            System.out.println(b);
        } catch (IOException ex) {
        }
    }
}
