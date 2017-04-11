package cf540;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        int s = 0;
        for(int i = 0;i < a.length();i++){
            int k = a.charAt(i) - b.charAt(i);
            if(k < 0) k += 10;
            s += Math.min(k, 10 - k);
        }
        System.out.println(s);
    }
    
}
