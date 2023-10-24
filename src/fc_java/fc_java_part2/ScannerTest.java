package fc_java.fc_java_part2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요: ");
        int num = scan.nextInt(); // 블럭상태
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요: ");
        float f = scan.nextFloat();
        System.out.println("f = " + f);

        scan.nextLine();// 버퍼비우기(스트림 비우기)

        System.out.println("문자열을 입력하세요: ");
        String s = scan.nextLine();
        System.out.println("문자열:" + s);

        scan.close();
    }
}
