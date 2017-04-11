package cf246;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        if(n < 3){
            System.out.println("-1");
            return;
        }
        System.out.print("3 2 1");
        for (int i = 4; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
