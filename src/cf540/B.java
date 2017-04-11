package cf540;


import java.util.Arrays;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String as[] = s.split(" ");
        int n = Integer.parseInt(as[0]);
        int k = Integer.parseInt(as[1]);
        int p = Integer.parseInt(as[2]);
        int x = Integer.parseInt(as[3]);
        int y = Integer.parseInt(as[4]);
        s = sc.nextLine();
        int[] m = new int[k];
        int sum = 0;
        if (k > 0) {
            as = s.split(" ");
            for (int i = 0; i < k; i++) {
                m[i] = Integer.parseInt(as[i]);
                sum += m[i];
            }
        }
        if (sum > x) {
            System.out.println("-1");
            return;
        }
        int left = x - sum;
        Arrays.sort(m);
        int med = n / 2;
        int first = 0;
        while (first < m.length && m[first] < y) {
            first++;
        }
        if (first > med || (med - first) + (n - k - (med - first)) * y > left) {
            System.out.println("-1");
        } else {
            String scores = "";
            for (int i = 0; i < med - first; i++) {
                scores += " " + 1;
            }
            for (int i = 0; i < n - k - (med - first); i++) {
                scores += " " + y;
            }
            if (scores.length() > 0) {
                System.out.println(scores.substring(1));
            } else {
                System.out.println();
            }
        }
    }

    public static int findFirst(int[] a, int f) {
        int j = 0;
        while (j < a.length && a[j] < f) {
            j++;
        }
        return j;
        /*
         int i = a.length / 2;
         int begin = 0;
         int end = a.length;
         while (true) {
         if (a[i] >= f && (i == 0 || a[i - 1] < f)) {
         break;
         } else if (a[i] < f) {
         begin = i;
         i = (end - begin) / 2 + begin;
         if (i == a.length - 1 && a[i] < f) {
         return a.length;
         }
         } else if (a[i] >= f) {
         end = i;
         i = (end - begin) / 2 + begin;
         }
         }
         return i;*/
    }
}
