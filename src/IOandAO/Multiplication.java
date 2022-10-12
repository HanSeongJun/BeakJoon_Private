package 백준.IOandAO;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine(), b = sc.nextLine();
        int[] num_b = new int[b.length()];

        for (int i = 0; i < b.length(); i++) {
            num_b[i] = b.charAt(i) - '0';
        }

        int num_a = Integer.parseInt(a);
        int num_b2 = Integer.parseInt(b);
        for (int i = 2; i > -1; i--) {
            int result = num_a * num_b[i];
            System.out.println(result);
        }

        System.out.println(num_a*num_b2);
    }
}
