package cf275;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int[][] n = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = sc.nextInt();
            }
        }
        int add[][] = new int[3][3];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (i > 0) {
                    add[i - 1][j] += n[i][j];
                }
                if (j > 0) {
                    add[i][j - 1] += n[i][j];
                }
                if (i + 1 < n.length) {
                    add[i + 1][j] += n[i][j];
                }
                if (j + 1 < n[i].length) {
                    add[i][j + 1] += n[i][j];
                }
            }
        }
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if ((n[i][j] + add[i][j]) % 2 == 0) {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
