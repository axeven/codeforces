package cf381;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = 0;
        int d = 0;
        int left = 0;
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            int take = 0;
            if (a[left] > a[right]) {
                take = a[left];
                left++;
            } else {
                take = a[right];
                right--;
            }
            if (i % 2 == 0) {
                s += take;
            } else {
                d += take;
            }
        }
        System.out.println(s + " " + d);
    }
}
