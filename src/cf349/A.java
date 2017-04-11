package cf349;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] m = new int[n];
        boolean can = true;
        int d = 0;
        int l = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (can) {
                if (a == 25) {
                    d++;
                } else if (a == 50) {
                    if (d < 1) {
                        can = false;
                    } else {
                        l++;
                        d--;
                    }
                } else {
                    if (d > 0 && l > 0) {
                        d--;
                        l--;
                    } else if (d > 2) {
                        d -= 3;
                    } else {
                        can = false;
                    }
                }
            }
        }
        if (can) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
