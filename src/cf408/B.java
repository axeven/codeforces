package cf408;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[] an = new int[26];
        int[] bn = new int[26];
        for (int i = 0; i < a.length(); i++) {
            an[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            bn[b.charAt(i) - 'a']++;
        }
        int r = 0;
        for (int i = 0; i < an.length; i++) {
            if (bn[i] > 0 && an[i] == 0) {
                System.out.println("-1");
                return;
            }
            r += Math.min(an[i], bn[i]);
        }
        System.out.println(r);
    }
}
