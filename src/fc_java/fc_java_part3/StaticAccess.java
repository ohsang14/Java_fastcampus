package fc_java.fc_java_part3;

import fc_java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtil, static인 경우
       int sum = MyUtil.hap(a,b); // 클래스 이름.호출 메서드
        System.out.println("sum : " + sum); // 30


    }
}
