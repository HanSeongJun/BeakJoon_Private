package 백준.Loop;

import java.util.Scanner;

public class AB8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        int[] a = new int[t];
        int[] b = new int[t];

        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < t; i++) {
            int sum = a[i] + b[i];
            System.out.println("Case #" + (i + 1) + ": " +
                    a[i] + " + " + b[i] + " = " + sum);
        }
    }
}
