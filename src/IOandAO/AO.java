package 백준.IOandAO;

import java.util.Scanner;

// 사칙연산
public class AO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        System.out.printf("%d %d %d %d %d", a+b, a-b, a*b, a/b, a%b);
    }
}
