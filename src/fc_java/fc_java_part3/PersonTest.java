package fc_java.fc_java_part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한 사람의 데이터를 저장할 [변수를 선언] 하세요.
        Person person = new Person();
        person.name = "옥슬이";
        person.age = 82;
        person.phone = "010-1234-5678";

        System.out.println(
                person.name +"\t" +
                person.age + "\t"+
                person.phone);
        person.play();
        person.eat();
        person.walk();
    }
}
