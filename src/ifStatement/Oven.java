package 백준.ifStatement;

import java.util.Scanner;

public class Oven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a : 시, b : 분, c : 요리에 필요한 시간
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int total = (a * 60) + b + c;
        int H = total / 60;
        int M = total % 60;

        if (H >= 24) {
            H -= 24;
        }

        System.out.println(H + " " + M);
    }
}
