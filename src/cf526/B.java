package cf526;


import java.util.Scanner;

/**
 *
 * @author lathif
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        String[] as = s.split(" ");
        int num = 0;
        int last = as.length - 1;
        int[] a = new int[1 << n];
        int[] b = new int[1 << n];
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 1 << i; j += 2) {
                int c = Integer.parseInt(as[last - j]);
                int d = Integer.parseInt(as[last - j - 1]);
                if (c + a[j] > d + a[j + 1]) {
                    b[j / 2] += c + a[j];
                    num += c + a[j] - d - a[j + 1];
                } else {
                    b[j / 2] += d + a[j + 1];
                    num += d + a[j + 1] - c - a[j];
                }
            }
            a = b;
            b = new int[1 << n];
            last -= 1 << i;
        }
        System.out.println(num);
    }
}
