package fc_java.fc_java_part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q.Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person();
        p.name = "길동이";
        p.age = 1000;
        p.phone = "010-2746-0094";
        System.out.println(p.name +"\t" + p.age +"\t" + p.phone);
    }

}
