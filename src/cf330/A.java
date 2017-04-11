package cf330;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        String[] s = new String[row];
        for (int i = 0; i < row; i++) {
            s[i] = sc.nextLine();
        }
        int eat = 0;
        for (int i = 0; i < row; i++) {
            if(!s[i].contains("S")){
                s[i] = s[i].replace('.', ' ');
                eat += s[i].length();
            }
        }
        for (int i = 0; i < col; i++) {
            int backeat = eat;
            String[] backup = new String[s.length];
            for (int j = 0; j < s.length; j++) {
                backup[j] = s[j] + "";
            }
            for (int j = 0; j < row; j++) {
                if(s[j].charAt(i) == '.'){
                    s[j] = s[j].substring(0, i) + ' ' + s[j].substring(i + 1);
                    eat++;
                }else if(s[j].charAt(i) == 'S'){
                    s =  backup;
                    eat = backeat;
                    break;
                }
            }
        }
        System.out.println(eat);
    }
}
