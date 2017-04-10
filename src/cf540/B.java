package cf540;


import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lathi
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] as = s.split(" ");
        int[] a = new int[as.length];
        int sum = 0;
        int st_y = 0;
        for (int i = 0; i < k; ++i) {
            a[i] = Integer.parseInt(as[i]);
            sum += a[i];
            if (a[i] < y) {
                st_y++;
            }
        }
        if (sum + n - k > x) {
            System.out.println("-1");
            return;
        }
        int max_left = x - sum;
        int median_to_add = n -k;
        if(y > 1)
            median_to_add = (max_left - n + k) / (y - 1);
        median_to_add = Math.min(median_to_add, n - k);
        if (st_y + n - k - median_to_add > n / 2) {
            System.out.println("-1");
            return;
        }
        for (int i = 0; i < median_to_add; i++) {
            System.out.print(y + " ");
        }
        for (int i = 0; i < (n - k - median_to_add - 1); i++) {
            System.out.print("1 ");
        }
        if (n - k - median_to_add > 0) {
            System.out.println("1");
        }
    }
}
