package cf281;


import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = s.charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.print((char)('A' + c - 'a'));
        System.out.println(s.substring(1));
        }else{
            System.out.println(s);
        }
    }
}
