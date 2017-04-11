package cf327;


import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 9900001;
        System.out.print(a);
        a++;
        for (int i = 1; i < n; i++, a++) {
            System.out.print(" " + a);
        }
        System.out.println();
    }
}
