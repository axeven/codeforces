package cf214;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Math.max(n, m);
        int exist = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= max; j++) {
                if(i * i + j == n && i + j * j == m){
                    exist++;
                }
            }
        }
        System.out.println(exist);
    }
}
