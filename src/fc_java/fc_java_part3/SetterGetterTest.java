package fc_java.fc_java_part3;

import fc_java.model.PersonVo;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q. setter, getter 메서드를 통해 PersonVO객체에
        // 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVo personVo = new PersonVo();
        personVo.setName("옥슬이");
        personVo.setAge(5000);
        personVo.setPhone("010-2746-0094");

        System.out.println(personVo.getName()+"\t"+
                personVo.getAge()+"\t"+
                personVo.getPhone());
    }
}
