package cf382;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String left = s.substring(0, s.indexOf('|'));
        String right = s.substring(s.indexOf('|') + 1);
        String a = sc.nextLine();
        int d = left.length() - right.length();
        int b = a.length() - Math.abs(d);
        if (b < 0 || b % 2 != 0) {
            System.out.println("Impossible");
            return;
        }
        left = left + a.substring(0, (a.length() - d) / 2);
        right = right + a.substring((a.length() - d) / 2);
        System.out.println(left + "|" + right);
    }
}
