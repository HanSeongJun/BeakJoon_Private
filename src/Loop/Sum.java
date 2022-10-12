package 백준.Loop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr);
    }
}
