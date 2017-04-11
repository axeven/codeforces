package cf427;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int c = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(p == 0 && a == -1){
                c++;
            }else{
                p += a;
            }
        }
        System.out.println(c);
    }
}
