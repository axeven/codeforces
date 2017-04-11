package cf344;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String current = sc.nextLine();
        int c =  1;
        for (int i = 1; i < n; i++) {
            String s = sc.nextLine();
            if(!s.equals(current)){
                current = s;
                c++;
            }
        }
        System.out.println(c);
    }
}
