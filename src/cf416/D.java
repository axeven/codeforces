package cf416;


import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String s = sc.nextLine();
        String[] as = s.split(" ");
        int c = 1;
        int[] dif = new int[as.length - 1];
        int x;
        int prevx = Integer.parseInt(as[0]);
        int xxx = -1000000000;
        for (int i = 1; i < as.length; i++) {
            x = Integer.parseInt(as[i]);
            dif[i - 1] = x - prevx;
            if (x == -1 || prevx == -1) {
                dif[i - 1] = xxx;
            }
            prevx = x;
        }
        int last = xxx;
        for (int i = 0; i < dif.length; i++) {
            System.out.println(i + " " + last + " " + dif[i] + " " + c);
            if (dif[i] == xxx) {
                continue;
            }
            if (dif[i] == last) {
                continue;
            }
            if (last != xxx) {
                c++;
                last = xxx;
                continue;
            }
            last = dif[i];
        }
        System.out.println(c);
    }
}
