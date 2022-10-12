package 백준.Loop;

import java.util.Scanner;

public class AB5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;
        int count = 0;
        int[] n = new int[100];

        while ((a = sc.nextInt()) != 0 && (b = sc.nextInt()) != 0) {
            int sum = 0;
            n[count] = a + b;
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(n[i]);
        }
    }
}
