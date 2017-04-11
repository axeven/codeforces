package cf041;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String[] as = a.split(" ");
        String[] bs = b.split(" ");
        if(a.length() != b.length() || as.length != bs.length){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < as.length; i++) {
            for (int j = 0; j < as[i].length(); j++) {
                if(as[i].charAt(j) != bs[i].charAt(as[i].length() - 1 - j)){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
