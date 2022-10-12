package 백준.String;

import java.util.Scanner;

public class String_Fre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A']++;
            }
        }

        int max = 0;
        char ch = '?';

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
