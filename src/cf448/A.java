package cf448;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cup = sc.nextInt() + sc.nextInt() + sc.nextInt();
        int medal = sc.nextInt() + sc.nextInt() + sc.nextInt();
        int n = sc.nextInt();
        cup = (int) Math.ceil(cup * 1.0 / 5);
        medal = (int) Math.ceil(medal * 1.0 / 10);
        if (n < cup + medal) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
