package fc_java.fc_java_part3;

import fc_java.model.PersonVo;

public class ToStringPrint {
    public static void main(String[] args) {
        //Q. 생성자 메서드를 통해 PersonVO객체에 원하는 이름, 나이, 전화번호를 저장하고 toString() 메서드로 출력하세요.
        PersonVo personVo = new PersonVo("오상현",31,"01023420002");
        System.out.println(personVo.getName() +"\t"+
                personVo.getAge()+"\t"+
                personVo.getPhone());

        System.out.println(personVo.toString());
        System.out.println(personVo);
    }
}
