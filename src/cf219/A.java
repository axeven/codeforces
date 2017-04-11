package cf219;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] count = new int['z' + 1];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        String res = "";
        for (int i = 'a'; i <= 'z'; i++) {
            if(count[i] % k != 0){
                System.out.println("-1");
                return;
            }else{
                int c = count[i] / k;
                for (int j = 0; j < c; j++) {
                    res += (char) i;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(res);
        }
        System.out.println();
    }
}
