package cf236;


import java.util.HashSet;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<String> c = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String a = s.charAt(i) + "";
            if (!c.contains(a)) {
                c.add(a);
            }
        }
        if(c.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
