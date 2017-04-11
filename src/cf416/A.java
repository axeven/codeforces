package cf416;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            int n = Integer.parseInt(s);
            int r = 2000000000;
            int l = -r;
            String[] ss;
            for (int i = 0; i < n; i++) {
                s = br.readLine();
                ss = s.split(" ");
                int a = Integer.parseInt(ss[1]);
                if (("<".equals(ss[0]) && "N".equals(ss[2])) || (">=".equals(ss[0]) && "Y".equals(ss[2]))) {
                    if (a > l) {
                        l = a;
                    }
                } else if (("<".equals(ss[0]) && "Y".equals(ss[2])) || (">=".equals(ss[0]) && "N".equals(ss[2]))) {
                    if (a - 1 < r) {
                        r = a - 1;
                    }
                } else if ((">".equals(ss[0]) && "N".equals(ss[2])) || ("<=".equals(ss[0]) && "Y".equals(ss[2]))) {
                    if (a < r) {
                        r = a;
                    }
                } else if ((">".equals(ss[0]) && "Y".equals(ss[2])) || ("<=".equals(ss[0]) && "N".equals(ss[2]))) {
                    if (a + 1 > l) {
                        l = a + 1;
                    }
                }
            }
            if (l > r) {
                System.out.println("Impossible");
            } else {
                System.out.println(l);
            }
        } catch (IOException ex) {
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
            }
        }
    }
}
