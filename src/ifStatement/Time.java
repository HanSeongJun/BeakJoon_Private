package 백준.ifStatement;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt(), M = sc.nextInt();
        if ((H >= 0 && H <= 24) && (M >= 0 && M <=60)) {
            int m = M - 45;

            if (m < 0) {
                H -= 1;
                m += 60;
                if (H < 0) {
                    H += 24;
                }
            } else {
                System.out.printf("%d %d",H, m);
            }
            System.out.printf("%d %d",H, m);
        } else {
            return;
        }
    }
}
