package fc_java.model;

public class PersonVo {
    private String name;
    private int age;
    private String phone;

    // 생략된 생성자 메서드가 있다. => 기본 생성자 ( default constructor)
    public PersonVo() {
//         객체를 생성하는 코드는 내부에서 만들어진다.
//         객체를 초기화 한다.
        this.name = "오상현";
        this.age = 35;
        this.phone = "010-3241-1324";
    }

    // 생성자의 오버로딩.
    public PersonVo(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
