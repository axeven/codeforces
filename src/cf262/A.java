package cf262;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String[] as = s.split(" ");
            int n = Integer.parseInt(as[0]);
            int k = Integer.parseInt(as[1]);
            s = br.readLine();
            as  = s.split(" ");
            int r = 0;
            for (int i = 0; i < as.length; i++) {
                int c = 0;
                for (int j = 0; j < as[i].length(); j++) {
                    if(as[i].charAt(j) == '4' || as[i].charAt(j) == '7'){
                        c++;
                    }
                }
                if(c <= k){
                    r++;
                }
            }
            System.out.println(r);
        } catch (IOException ex) {
        }
    }
}
