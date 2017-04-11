package cf282;


import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int x = 0;
        String s = sc.nextLine();
        for(int j = 0; j < i;j++){
            s = sc.nextLine();
            if(s.equals("X++") || s.equals("++X")){
                x++;
            }else{
                x--;
            }
        }
        System.out.println(x);
    }
}
