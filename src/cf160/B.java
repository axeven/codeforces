package cf160;


import java.util.Arrays;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        s = sc.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = s.charAt(i + n);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int flag = 0;
        if (a[0] < b[0]) {
            flag = 1;
        } else if (a[0] > b[0]) {
            flag = 2;
        }
        for (int i = 1; i < n; i++) {
            if (flag == 1) {
                if (a[i] >= b[i]) {
                    flag = 0;
                    break;
                }
            } else {
                if (a[i] <= b[i]) {
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
