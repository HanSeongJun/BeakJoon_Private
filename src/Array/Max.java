package 백준.Array;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int max = num[0];
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if ( num[i] > max) {
                max = num[i];
                n = i;
            }
        }
        System.out.println(max);
        System.out.println(n+1);
    }
}
