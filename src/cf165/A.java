package cf165;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int r = 0;
        for (int i = 0; i < n; i++) {
            boolean left = false, right = false, up = false, down = false;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (!left) {
                        left = (y[j] > y[i] && x[j] == x[i]);
                    }
                    if (!right) {
                        right = (y[j] < y[i] && x[j] == x[i]);
                    }
                    if (!up) {
                        up = (y[j] == y[i] && x[j] > x[i]);
                    }
                    if (!down) {
                        down = (y[j] == y[i] && x[j] < x[i]);
                    }
                    if (up && down && left && right) {
                        r++;
                        break;
                    }
                }
            }
        }
        System.out.println(r);
    }
}
