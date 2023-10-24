package fc_java.fc_java_part3;

// object = 상태정보 (맴버변수 ) + 행위 정보 (맴버 메서드)
public class Person {
    public String name;
    public int age;
    public String phone;

    // 기본 생성자 메서드
    public Person(){

    }
    public void play(){
        System.out.println("운동을 합니다.");
    }
    public void eat(){
        System.out.println("음식을 먹다");
    }
    public void walk(){
        System.out.println("걷는다.");
    }
}
