package 백준.Loop;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // 총 금액
        int n = sc.nextInt(); // 물건 종류의 수

        int[] a = new int[n]; // 물건의 가격을 저장하는 배열
        int[] b = new int[n]; // 물건의 개수를 저장하는 배열

        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            sum += (a[i] * b[i]);
        }

        if (x == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
