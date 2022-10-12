package 백준.ifStatement;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int money = 0;

        if (a == b && a == c && b == c) {
            money = money + 10000 + (a * 1000);
        }

        if (a != b) {
            if (a == c) { // a = c, a != b
                money = money + 1000 + (a * 100);
            }
        } else {
            if (a != c) { // a = b, a != c
                money = money + 1000 + (a * 100);
            }
        }

        if (b == c) {
            if (b != a) {
                money = money + 1000 + (b * 100); // b = c, b != a
            }
        }

        if (a != b && a != c && b != c) {
            int[] max = new int[3];
            max[0] = a;
            max[1] = b;
            max[2] = c;

            int max_num = max[0];
            for (int i = 1; i < max.length; i++) {
                if (max_num < max[i]) {
                    max_num = max[i];
                }
            }

            money = max_num * 100;
            }

        System.out.println(money);

        for (int i = 1; i <= 5; i++) {
            System.out.println("I can do it.");
        }


    }
}

