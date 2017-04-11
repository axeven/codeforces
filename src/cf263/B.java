package cf263;


import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if(k > n){
            System.out.println("-1");
            return;
        }
        Arrays.sort(a);
        int in = 0;
        int j;
        for (j = n-1; j >= 0; j--) {
            in++;
            while(j >= 1 && a[j] == a[j - 1]){
                j--;
                in++;
            }
            if(in >= k){
                break;
            }
        }
        if(in == k){
            System.out.println(a[j] + " 0");
        }else{
            System.out.println("-1");
        }
    }
}
