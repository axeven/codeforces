package cf449;


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
public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        if (n + m - 2 < k) {
            System.out.println("-1");
            return;
        }
        if (k < Math.max(m, n)) {
            System.out.println(Math.max(m  / (k + 1) * n, n  / (k + 1) * m));
            return;
        }
        System.out.println(Math.min(m, n) / (k - Math.max(m, n) + 2));
//        int max = 0;
//        for (int i = 0; i <= k; i++) {
//            int temp = n / (i + 1) * (m / (k - i + 1));
//            max = Math.max(max, temp);
//
//        }
//        if (max == 0) {
//            System.out.println("-1");
//        } else {
//            System.out.println(max);
//        }
    }
}
