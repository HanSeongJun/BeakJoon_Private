package 백준.Loop;

import java.util.Scanner;

public class xNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] N = new int[n];

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (N[i] < x) {
                System.out.print(N[i] + " ");
            }
        }
    }
}
