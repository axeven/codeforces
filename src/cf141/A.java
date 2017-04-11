package cf141;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String owner  = sc.nextLine();
        String guest = sc.nextLine();
        String pile  = sc.nextLine();
        
        if(owner.length() + guest.length() != pile.length()){
            System.out.println("NO");
            return;
        }
        
        HashMap<String, Integer> a = new HashMap<>();
        for (int i = 0; i < owner.length(); i++) {
            String c = owner.charAt(i) + "";
            if(!a.containsKey(c)){
                a.put(c, 1);
            }else{
                a.put(c, a.get(c) + 1);
            }
        }
        for (int i = 0; i < guest.length(); i++) {
            String c = guest.charAt(i) + "";
            if(!a.containsKey(c)){
                a.put(c, 1);
            }else{
                a.put(c, a.get(c) + 1);
            }
        }
        HashMap<String, Integer> b = new HashMap<>();
        for (int i = 0; i < pile.length(); i++) {
            String c = pile.charAt(i) + "";
            if(!b.containsKey(c)){
                b.put(c, 1);
            }else{
                b.put(c, b.get(c) + 1);
            }
        }
        
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            String string = entry.getKey();
            Integer integer = entry.getValue();
            if(b.get(string) == null || integer != b.get(string)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
