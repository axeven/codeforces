package cf058;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        String s = (new Scanner(System.in).nextLine());
        int h = s.indexOf('h');
        if (h > -1) {
            h++;
            h = s.indexOf('e', h);
            if (h > -1) {
                h++;
                h = s.indexOf('l', h);
                if (h > -1) {
                    h++;
                    h = s.indexOf('l', h);
                    if (h > -1) {
                        h++;
                        h = s.indexOf('o', h);
                        if (h > -1) {
                            h++;
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");

    }
}
