package cf399;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();
        int page = p;
        p -= k;
        while (p < 1) {
            p++;
        }
        if (p != 1) {
            System.out.print("<< ");
        }
        for (; p <= page + k && p <= n; p++) {
            if (p == page) {
                System.out.print("(" + p + ") ");
            }else if (p == n) {
                System.out.println(p);
            } else {
                System.out.print(p + " ");
            }
        }
        
        if(p != n + 1){
            System.out.println(">>");
        }
    }
}
