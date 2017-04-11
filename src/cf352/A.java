package cf352;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 0;
        int z = 0;
        for (int i = 0; i < n; i++) {
            if(sc.nextInt() == 0){
                z++;
            }else{
                f++;
            }
        }
        if(z == 0){
            System.out.println("-1");
        }else if(f < 9){
            System.out.println("0");
        }else{
            for (int i = f; i > 8; i -= 9) {
                for (int j = 0; j < 9; j++) {
                    System.out.print("5");
                }
            }
            for (int i = 0; i < z; i++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
