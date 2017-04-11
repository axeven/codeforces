package cf230;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = br.readLine();
            String[] ss = line.split(" ");
            int s = Integer.parseInt(ss[0]);
            int n = Integer.parseInt(ss[1]);
            int[] xs = new int[n];
            int[] ys = new int[n];
            int nnow = 0;
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                ss = line.split(" ");
                insert(Integer.parseInt(ss[0]), Integer.parseInt(ss[1]), xs, ys, nnow);
                nnow++;
            }
            for (int i = 0; i < n; i++) {
                if (s > xs[i]) {
                    s += ys[i];
                } else {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
            br.close();
        } catch (IOException ex) {
        }
    }

    public static void insert(int x, int y, int[] xs, int[] ys, int n) {
        xs[n] = x;
        ys[n] = y;
        for (int i = n; i > 0; i--) {
            if (xs[i - 1] > xs[i]) {
                int a = xs[i];
                xs[i] = xs[i - 1];
                xs[i - 1] = a;
                a = ys[i];
                ys[i] = ys[i - 1];
                ys[i - 1] = a;
            } else {
                break;
            }
        }
    }
}
