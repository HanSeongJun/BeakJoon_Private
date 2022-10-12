package 백준.String;


import java.util.Scanner;

public class String_Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        String[] strings = str.split(" ");

        if (strings.length == 1 && strings[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(strings.length);
        }

    }
}
