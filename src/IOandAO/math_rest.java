package 백준.IOandAO;

import java.util.Scanner;

public class math_rest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.printf("%d\n", (a + b) % c);
        System.out.printf("%d\n", ((a % c) + (b % c)) % c);
        System.out.printf("%d\n", (a * b) % c);
        System.out.printf("%d\n", ((a % c) * (b % c)) % c);
    }
}
