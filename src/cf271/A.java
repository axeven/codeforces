package cf271;


import java.util.HashSet;
import java.util.Scanner;

public class A {
    public static void main(String[] args){
        int i = (new Scanner(System.in)).nextInt();
        i++;
        for(; true;i++){
            if(check(i)){
                System.out.println(i);
                return;
            }
        }
    }
    
    public static boolean check(int i){
        String s = i + "";
        HashSet<String> c = new HashSet<>();
        for(int j = 0; j < s.length();j++){
            String k = s.charAt(j) + "";
            if(!c.contains(k)){
                c.add(k);
            }
        }
        return c.size() == s.length();
    }
}
