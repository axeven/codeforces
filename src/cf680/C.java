package cf680;


import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        int[] prim = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        Scanner sc = new Scanner(System.in);
        int div = 0;
        for (int i = 0; i < prim.length; i++) {
            System.out.println(prim[i]);
            System.out.flush();
            String ans = sc.nextLine();
            if (ans.equals("yes")) {
                div++;
                if (div == 2) {
                    System.out.println("composite");
                    return;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(prim[i] * prim[i]);
            System.out.flush();
            String ans = sc.nextLine();
            if (ans.equals("yes")) {
                div++;
                if (div == 2) {
                    System.out.println("composite");
                    return;
                }
            }
        }
        System.out.println("prime");
    }
}
