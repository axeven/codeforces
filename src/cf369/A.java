package cf369;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int bowl = sc.nextInt();
        int plate = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < day; i++) {
            if (sc.nextInt() == 1) {
                a++;
            } else {
                b++;
            }
        }
        int aa = Math.max(0, a - bowl);
        int bo = Math.max(0, bowl - a);
        int bb = Math.max(0, b - bo - plate);
        System.out.println(aa + bb);
    }
}
