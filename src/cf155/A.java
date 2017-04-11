package cf155;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        int amaz = 0;
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            if(a < min){
                amaz++;
                min = a;
            }else if(a > max){
                amaz++;
                max = a;
            }
        }
        System.out.println(amaz);
    }
}
