package fc_java.fc_java_part3;

import fc_java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1 ; // st1 : object , 객체 변수
        Student st2 ; // st2 : object , 객체 변수
        Student st3 ; // st3 : object , 객체 변수

        st1 = new Student("홍길동", "컴공", 37,
                "ast6108@nave.rcom", 20231110, "010-2746-0094");
        // st1 : instance
        st2 = new Student("나길동", "컴공", 37,
                "ast6108@nave.rcom", 20231110, "010-2746-0094");
        // st2 : instance
        st3 = new Student("김보니", "컴공", 37,
                "ast6108@nave.rcom", 20231110, "010-2746-0094");
        // st3 : instance

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
