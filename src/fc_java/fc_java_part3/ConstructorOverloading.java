package fc_java.fc_java_part3;

import fc_java.model.PersonVo;

public class ConstructorOverloading {
    public static void main(String[] args) {
        //Q. 생성자 메서드를 통해 PersonVO객체에 이름, 나이, 전화번호를 저장하고 출력하세요.
        // PersonVo personVo = new PersonVo();
        PersonVo personVo1 = new PersonVo("김보니",7,"왈왈와로알 간식내놔");
        PersonVo personVo2 = new PersonVo("김인직", 33, "맹박사님!");

        //System.out.println(personVo.getName()+"\t"+
        //        personVo.getAge()+"\t"+
         //       personVo.getPhone());
        System.out.println(personVo1.getName()+"\t"+
                personVo1.getAge()+"\t"+
                personVo1.getPhone());
        System.out.println(personVo2.getName()+"\t"+
                personVo2.getAge()+"\t"+
                personVo2.getPhone());


    }
}
