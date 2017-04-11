package cf416;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            String ss[] = s.split(" ");
            int m = Integer.parseInt(ss[0]);
            int n = Integer.parseInt(ss[1]);
            int t[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                s = br.readLine();
                ss = s.split(" ");
                for (int j = 0; j < n; j++) {
                    t[i][j] = Integer.parseInt(ss[j]);
                }
            }
            int[] paintime = new int[m];
            paintime[0] = t[0][0];
            for (int i = 1; i < m; i++) {
                paintime[i] = paintime[i - 1] + t[i][0];
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j > 0) {
                        paintime[j] = Math.max(paintime[j - 1], paintime[j]);
                    }
                    paintime[j] += t[j][i];
                }
            }
            for (int i = 0; i < m; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(paintime[i]);
            }
            System.out.println();
        } catch (IOException ex) {
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
            }
        }
    }
}
