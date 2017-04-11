package cf025;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int feven = -1;
        int fodd = -1;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0) {
                even++;
                if (even == 1) {
                    feven = i;
                }
            } else {
                odd++;
                if (odd == 1) {
                    fodd = i;
                }
            }
        }
        if (odd > even) {
            System.out.println(feven + 1);
        } else {
            System.out.println(fodd + 1);
        }
    }
}
