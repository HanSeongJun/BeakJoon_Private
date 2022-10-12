package 백준.IOandAO;

import java.util.Scanner;

// 기본 사칙연산
public class A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1 = a + b;
        int result2 = a - b;
        int result3 = a * b;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double result4 = num1 / num2;

        System.out.println(result4);
    }
}
