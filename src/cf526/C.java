package cf526;


import java.util.Scanner;

/**
 *
 * @author lathif
 */
public class C {

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).nextLine();
        String[] as = s.split(" ");
        int c = Integer.parseInt(as[0]);
        int hr = Integer.parseInt(as[1]);
        int hb = Integer.parseInt(as[2]);
        int wr = Integer.parseInt(as[3]);
        int wb = Integer.parseInt(as[4]);
        if (hr * 1.0 / wr < hb * 1.0 / wb) {
            int ht = hr;
            hr = hb;
            hb = ht;
            int wt = wr;
            wr = wb;
            wb = wt;
        }
        int eat = (c / wr) * wr;
        int left = c - eat;
        if (left == 0) {
            System.out.println(eat / wr * hr);
        }
        int i = left / wb;
        while (i < 1) {
            left += wr;
            i = left / wb;
        }
        if (eat / wr * hr < (c - left) / wr * hr + i * hb) {
            System.out.println((c - left) / wr * hr + i * hb);
        } else {
            System.out.println(eat / wr * hr);
        }
    }
}
