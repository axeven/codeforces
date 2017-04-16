package cf526;

import java.util.Scanner;

/**
 *
 * @author lathif
 */
public class C {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).nextLine();
        String[] as = s.split(" ");
        long c = Long.parseLong(as[0]);
        int hr = Integer.parseInt(as[1]);
        int hb = Integer.parseInt(as[2]);
        int wr = Integer.parseInt(as[3]);
        int wb = Integer.parseInt(as[4]);
        long ans = 0;
        if (hb * wr > hr * wb) {
            int temp = hr;
            hr = hb;
            hb = temp;
            temp = wr;
            wr = wb;
            wb = temp;
        }
        if (Math.max(wb, wr) > c) {
            if (wb > wr) {
                wb = wr;
                hb = hr;
            }
            System.out.println(c / wb * hb);
            return;
        }
        long lim = Math.min(wr / gcd(wb, wr) + 1, c / wb);
        if (c / wr < lim) {
            lim = c / wr;
            int temp = hr;
            hr = hb;
            hb = temp;
            temp = wr;
            wr = wb;
            wb = temp;
        }
        for (long i = 0; i <= lim; ++i) {
            ans = Math.max(ans, i * hb + (c - i * wb) / wr * hr);
        }
        System.out.println(ans);
    }
}
