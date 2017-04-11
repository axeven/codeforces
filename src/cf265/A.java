package cf265;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int index = 0;
        for (int i = 0; i < b.length(); i++) {
            if(a.charAt(index) == b.charAt(i)){
                index++;
                if(index >= a.length()){
                    break;
                }
            }
        }
        index = Math.min(index + 1, a.length());
        System.out.println(index);
    }
}
