package cf224;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int r = (int) Math.sqrt(a * b / c) + (int) Math.sqrt(a * c / b) + (int) Math.sqrt(c * b / a);
        System.out.println(r * 4);
    }
}
