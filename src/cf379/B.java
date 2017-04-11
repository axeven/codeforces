package cf379;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        for (int i = 0; i < max; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (a[j] > 0) {
                        System.out.print("P");
                        a[j]--;
                    }
                    if (j == n - 1) {
                        if(a[j] > 0){
                            System.out.print("LR");
                        }
                    } else {
                        System.out.print("R");
                    }
                }
            } else {
                for (int j = n - 1; j > -1; j--) {
                    if(a[j] > 0){
                        System.out.print("P");
                        a[j]--;
                    }
                    if(j == 0){
                        if(a[j] > 0){
                            System.out.print("RL");
                        }
                    }else{
                        System.out.print("L");
                    }
                }
            }
        }
        System.out.println();
    }
}
