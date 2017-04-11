package cf258;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r;
        if(s.contains("0")){
            r = s.substring(0, s.indexOf("0")) + s.substring(s.indexOf("0") + 1);
        }else{
            r = s.substring(1);
        }
        int i = 0;
        for (; i < r.length(); i++) {
            if(r.charAt(i) == '0'){
                
            }else{
                break;
            }
        }
        if(i == r.length())
            System.out.println("0");
        else
            System.out.println(r.substring(i));
    }
}
