package cf339;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                x1++;
            } else if (s.charAt(i) == '2') {
                x2++;
            } else if (s.charAt(i) == '3') {
                x3++;
            }
        }
        s = "";
        for (int i = 0; i < x1; i++) {
            s += "1+";
        }
        for (int i = 0; i < x2; i++) {
            s += "2+";
        }
        for (int i = 0; i < x3; i++) {
            s += "3+";
        }
        s = s.substring(0, s.length() - 1);
        System.out.println(s);
    }
}
