package cf001;


import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if(s.contains("R") 
                    && s.contains("C") 
                    && s.indexOf('C') - s.indexOf('R') > 1 
                    && s.charAt(s.indexOf('R') + 1)  < 'A'){
                int row = Integer.parseInt(s.substring(s.indexOf('R') + 1, s.indexOf('C')));
                int col = Integer.parseInt(s.substring(s.indexOf('C') + 1));
                String co = "";
                while(col > 0){
                    col--;
                    int rem = col % 26;
                    co = ((char) ('A' + rem)) + co;
                    col -= rem;
                    col /= 26;
                }
                System.out.println(co+row);
            }else{
                int col = 0;
                int p = 1;
                int row = 0;
                int q = 1;
                for (int j = s.length() - 1; j >= 0; j--) {
                    if(s.charAt(j) > '9'){
                        col += (s.charAt(j) - 'A' + 1) * p;
                        p *= 26;
                    }else{
                        row += (s.charAt(j) - '0') * q;
                        q *= 10;
                    }
                }
                System.out.println("R" + row + "C" + col);
            }
        }
    }
}
