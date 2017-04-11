package cf268;


import java.util.Scanner;

public class B {
    public static void main(String[] args){
        int n = (new Scanner(System.in)).nextInt();
        int r = (n - 1) * n / 2 + n;
        for(int i = 1 ; i < n - 1;i++){
            r += i * (n - 1 - i);
        }
        System.out.println(r);
    }
}
