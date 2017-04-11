package cf435;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int bus = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            cur += a;
            if (cur >= m) {
                bus++;
                if (cur == m) {
                    cur = 0;
                } else {
                    cur = a;
                }
            }
        }
        if(cur > 0){
            bus++;
        }
        System.out.println(bus);
    }
}
