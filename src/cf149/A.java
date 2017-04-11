package cf149;


import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[12];
        for (int i = 0; i < 12; i++) {
            a[i] = sc.nextInt();
        }
        if(k == 0){
            System.out.println("0");
            return;
        }
        Arrays.sort(a);
        int n = 0;
        int b = 0;
        for (; n <= 11; n++) {
            b += a[11 - n];
            if (b >= k) {
                n++;
                break;
            }
        }
        if (b >= k) {
            System.out.println(n);
        } else {
            System.out.println(-1);
        }
    }
}
