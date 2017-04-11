package cf122;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in).nextInt());
        int a = 1;
        int lim = (int) Math.sqrt(n);
        while (a <= lim) {
            if (n % a == 0) {
                if (isLucky(a) || isLucky(n / a)) {
                    System.out.println("YES");
                    return;
                }
            }
            a++;
        }
        System.out.println("NO");
    }

    public static int prevLucky(int a) {
        while (!isLucky(--a)) {
        }
        return a;
    }

    public static boolean isLucky(int a) {
        String s = a + "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '4' && s.charAt(i) != '7') {
                return false;
            }
        }
        return true;
    }
}
