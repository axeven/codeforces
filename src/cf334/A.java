package cf334;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int p = n * n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j > 0)
                    System.out.print(" ");
                int a = j * n + 1 + i;
                a += n - j;
                if(a > (j + 1) * n){
                    a -= n;
                }
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
