package cf404;


import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[n];
        int mid = n/ 2;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].charAt(i) != arr[0].charAt(mid)
                    && arr[i].charAt(i) == arr[0].charAt(0)
                    && arr[i].charAt(i) == arr[i].charAt(n - 1 - i)) {
                for (int j = 0; j < arr[i].length(); j++) {
                    if (j != i && j != n - 1 - i) {
                        if (arr[i].charAt(j) == arr[0].charAt(mid)) {
                        } else {
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
