package cf208;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).nextLine();
        while (s.length() >= 3 && s.substring(0, 3).equals("WUB")) {
            s = s.substring(3);
        }

        while (s.length() >= 3 && s.substring(s.length() - 3).equals("WUB")) {
            s = s.substring(0, s.length() - 3);
        }
        String[] split = s.split("WUB");
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1) {
                if (split[i].length() > 0) {
                    System.out.print(split[i]);
                }
            } else {
                if (split[i].length() > 0) {
                    System.out.print(split[i] + " ");
                }
            }
        }
        System.out.println();
    }
}
