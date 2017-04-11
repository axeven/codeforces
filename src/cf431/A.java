package cf431;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] as = s.split(" ");
        int[] v = new int[as.length];
        for (int i = 0; i < as.length; i++) {
            v[i] = Integer.parseInt(as[i]);
        }
        String l = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < l.length(); i++) {
            sum += v[l.charAt(i) - '1'];
        }
        System.out.println(sum);
    }
}
