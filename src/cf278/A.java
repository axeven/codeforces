package cf278;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            sum += s[i];
        }
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int a = Math.min(aa, bb);
        int b = Math.max(aa, bb);
        if(a == b){
            System.out.println("0");
            return;
        }
        int d = 0;
        for (int i = a - 1; i < b - 1; i++) {
            d += s[i];
        }
        System.out.println(Math.min(d, sum - d));
    }
}
