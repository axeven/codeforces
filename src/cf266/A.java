package cf266;


import java.util.Scanner;

public class A {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char prev = s.charAt(0);
        int rem = 0;
        for(int i = 1; i < s.length();i++){
            if(s.charAt(i) == prev){
                rem++;
            }else{
                prev = s.charAt(i);
            }
        }
        System.out.println(rem);
    }
}
