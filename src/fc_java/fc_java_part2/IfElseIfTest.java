package fc_java.fc_java_part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumsu = 84;
        if(jumsu >= 90){
            System.out.println("A반");
        }else if(jumsu >= 85){
            System.out.println("B반");
        }else{
            System.out.println("씨반");
        }

        System.out.println("년도를 입력하세요.");
        int year = sc.nextInt();
        if((year %4 == 0 && year % 100 ==0) || (year% 400 == 0)){
            System.out.println("윤년입니다.");
        }else{
            System.out.println("평년입니다.");
        }
    }
}
