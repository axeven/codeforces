package cf387;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String as[] = sc.nextLine().split(":");
        String bs[] = sc.nextLine().split(":");
        int m = Integer.parseInt(as[1]) - Integer.parseInt(bs[1]);
        int h = Integer.parseInt(as[0]) - Integer.parseInt(bs[0]);
        if (m < 0) {
            m += 60;
            h--;
        }
        if (h < 0) {
            h += 24;
        }
        String hs = h + "";
        if (hs.length() != 2) {
            hs = "0" + hs;
        }
        String ms = m + "";
        if (ms.length() != 2) {
            ms = "0" + ms;
        }
        System.out.println(hs + ":" + ms);
    }
}
