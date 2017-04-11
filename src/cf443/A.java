package cf443;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] a = new int[256];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        int sum = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if(a[i] > 0)
                sum++;
        }
        System.out.println(sum);
    }
}
