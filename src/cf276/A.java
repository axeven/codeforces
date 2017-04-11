package cf276;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        int t;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b > time){
                t = a - (b - time);
            }else{
                t = a;
            }
            max = Math.max(max, t);
        }
        System.out.println(max);
    }
}
