package fc_java.fc_java_part3;

import fc_java.model.PersonVo;

public class ConstructorInit {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO객체에
        // 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVo personVo = new PersonVo();
        System.out.println(personVo.getName() +"\t"+
                personVo.getAge()+"\t"+
                personVo.getPhone());

        PersonVo personVo1 = new PersonVo();
        System.out.println(personVo1.getName() +"\t"+
                personVo1.getAge()+"\t"+
                personVo1.getPhone());

        // 개발자가 원하는 값으로 초기화를 하는 방법?

    }
}
