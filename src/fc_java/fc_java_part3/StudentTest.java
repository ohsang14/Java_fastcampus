package fc_java.fc_java_part3;

import fc_java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생성하시오.
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 68;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        Student student = new Student("홍길동", "컴공", 37, "ast6108@nave.rcom", 20231110, "010-2746-0094");
        System.out.println(student.toString());
    }
}
