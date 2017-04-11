package cf270;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        int[] ts = new int[t];
        for (int i = 0; i < t; i++) {
            ts[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int angle = 180 - ts[i];
            if(360 % angle == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
