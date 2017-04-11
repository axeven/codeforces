package cf059;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        String s = (new Scanner(System.in)).nextLine();
        int up = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                up++;
            }
        }
        if(up > s.length() / 2){
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    c = (char) (c - 'a' + 'A');
                }
                s = s.substring(0, i) + c + s.substring(i + 1);
            }
        }else{
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    c = (char) (c - 'A' + 'a');
                }
                s = s.substring(0, i) + c + s.substring(i + 1);
            }
        }
        System.out.println(s);
    }
}
