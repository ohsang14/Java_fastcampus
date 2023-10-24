package fc_java.fc_java_part2;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        //Q. x의 값이 8보다 큰 경우에만 "양수입니다" 출력
        int x = 10;
        if (x>8) {
            System.out.println("양수입니다.");
        }else {
            System.out.println("음수입니다.");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요! ");
        int num = scan.nextInt();
        if (num%7 == 0){
            System.out.println("7의 배수입니다.");
        }
        // Q. 나이를 입력 받아 19세 이상이면 성인임을 출력
        System.out.println("나이를 입력하세요");
        int age = scan.nextInt();
        if(age >=19){
            System.out.println("성인입니다. ");
        }
        System.out.println("종료");
    }
}
