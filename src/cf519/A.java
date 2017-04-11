package cf519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lathif
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String board[] = new String[8];
        int q = 9;
        int r = 5;
        int b = 3;
        int n = 3;
        int p = 1;
        int bi = 0;
        int sm = 0;
        try {
            for (int i = 0; i < 8; i++) {
                board[i] = br.readLine();
                for (int j = 0; j < 8; j++) {
                    switch (board[i].charAt(j)) {
                        case 'Q':
                            bi += q;
                            break;
                        case 'q':
                            sm += q;
                            break;
                        case 'R':
                            bi += r;
                            break;
                        case 'r':
                            sm += r;
                            break;
                        case 'B':
                            bi += b;
                            break;
                        case 'b':
                            sm += b;
                            break;
                        case 'N':
                            bi += n;
                            break;
                        case 'n':
                            sm += n;
                            break;
                        case 'P':
                            bi += p;
                            break;
                        case 'p':
                            sm += p;
                            break;
                    }
                }
            }
            if (bi == sm) {
                System.out.println("Draw");
            } else if (bi > sm) {
                System.out.println("White");
            } else {
                System.out.println("Black");
            }
        } catch (IOException ex) {
        }
    }

}
