package cf291;


import java.util.Arrays;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);
        int f = 0;
        int last = -1;
        int lastc = 0;
        for (int i = 0; i < n; i++) {
            if (d[i] > 0) {
                if (d[i] == last) {
                    lastc++;
                } else {
                    if (lastc > 2) {
                        System.out.println("-1");
                        return;
                    } else if (lastc == 2) {
                        f++;
                    }
                    last = d[i];
                    lastc = 1;
                }
            }
        }
        if (lastc > 2) {
            System.out.println("-1");
            return;
        } else if (lastc == 2) {
            f++;
        }
        System.out.println(f);
    }
}
