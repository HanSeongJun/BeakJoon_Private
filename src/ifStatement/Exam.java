package 백준.ifStatement;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (89 < num && num <= 100) {
            System.out.println("A");
        } else if (79 < num && num <= 89) {
            System.out.println("B");
        } else if (69 < num && num <= 79) {
            System.out.println("C");
        } else if (59 < num && num <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
