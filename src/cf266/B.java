package cf266;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        for (int i = 0; i < t; i++) {
            s = process(s);
        }
        System.out.println(s);
    }

    public static String process(String s) {
        String r = s + "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'G' && s.charAt(i - 1) == 'B') {
                r = r.substring(0, i - 1) + "GB" + r.substring(i + 1);
            }
        }
        return r;
    }
}
