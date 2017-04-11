package cf263;


import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col = 0, row = 0;
        for(int  i = 0; i < 5;i++){
            for(int j = 0; j < 5;j++){
                int a = sc.nextInt();
                if(a == 1){
                    col = j;
                    row = i;
                }
            }
        }
        System.out.println(Math.abs(2 - row) + Math.abs(2 - col));
    }
}
