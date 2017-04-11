package cf405;


import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);
        for (int i = 0; i < n; i++) {
            if(i > 0 ){
                System.out.print(" ");
            }
            System.out.print(m[i]);
        }
        System.out.println();
    }
}
