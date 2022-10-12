package 백준.IOandAO;

import java.util.Scanner;

/*
    노가다식 말고 배열로 풀어보자...
 */
public class chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = 1, q = 1, l = 2, b = 2, n = 2, p = 8;
        int input_k = sc.nextInt(), input_q = sc.nextInt(),input_l = sc.nextInt(),
                input_b = sc.nextInt(), input_n = sc.nextInt(), input_p = sc.nextInt();

        System.out.printf("%d %d %d %d %d %d", k - input_k, q - input_q, l - input_l,
                b - input_b, n - input_n, p - input_p);
    }
}
