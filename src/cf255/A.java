package cf255;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] train = new int[3];
        for (int i = 0; i < n; i++) {
            train[i % 3] += sc.nextInt();
        }
        if (train[0] > train[1] && train[0] > train[2]) {
            System.out.println("chest");
        } else if (train[1] > train[2]) {
            System.out.println("biceps");
        } else {
            System.out.println("back");
        }
    }
}
