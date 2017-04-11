package cf118;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int m = n * 2 + 1;
        for (int i = 0; i < m; i++) {
            int r = m - (Math.abs(i - n));
            for (int j = 0; j < r; j++) {
                if(j > 0){
                    System.out.print(" ");
                }
                int a = n - Math.abs(j - n);
                a = a - Math.abs(i - n);
                if(a < 0){
                    System.out.print(" ");
                }else{
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }
}
