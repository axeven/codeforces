package cf336;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x > 0){
            System.out.print("0 ");
            if( y > 0){
                System.out.print((y + Math.abs(x)) + " ");
            }else{
                System.out.print((y - Math.abs(x)) + " ");
            }
            System.out.print((x + Math.abs(y)) + " 0");
        }else{
            System.out.print((x - Math.abs(y)) + " 0 0 ");
            if(y > 0){
                System.out.print((y + Math.abs(x)));
            }else{
                System.out.print((y - Math.abs(x)));
            }
        }
        System.out.println();
    }
}
