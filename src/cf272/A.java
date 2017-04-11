package cf272;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = 0;
        for (int i = 0; i < f; i++) {
            s += sc.nextInt();
        }
        int w = 5;
        for (int i = 1; i <= 5; i++) {
            if((s + i) % (f + 1) == 1){
                w--;
            }
        }
        System.out.println(w);
    }
}
