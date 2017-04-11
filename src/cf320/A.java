package cf320;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).nextLine();
        while (s.contains("144")) {
            int i = s.indexOf("144");
            s = s.substring(0, i) + "LLL" + s.substring(i + 3);
        }
        while (s.contains("14")) {
            int i = s.indexOf("14");
            s = s.substring(0, i) + "LL" + s.substring(i + 2);
        }
        while (s.contains("1")) {
            int i = s.indexOf("1");
            s = s.substring(0, i) + "L" + s.substring(i + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'L') {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
