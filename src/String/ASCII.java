package 백준.String;
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char str = sc.nextLine().charAt(0);
        // charAt() : String으로 저장된 문자열  한 글자만 선택에서 char타입으로 변환

        int ascii = (int)str;

        System.out.println(ascii);
    }
}
