package fc_java.fc_java_part3;

import fc_java.model.PersonVo;

public class PersonInfoHide {
    public static void main(String[] args) {
        //Q. 한사람의 [회원] 정보를 저장할 [객체를 생성] 하시오.
        PersonVo personVo = new PersonVo();
        personVo.setName("홍길동");
        personVo.setAge(30);
        personVo.setPhone("010-2746-0094");
//        personVo.name = "옥슬이";
//        personVo.age = 5000; // 정보 은닉이 되지 않음.
//        personVo.phone = "010-1111-1111";
//
//        System.out.println(personVo.name +"\t"+
//                personVo.age+"\t"+
//                personVo.phone);

        System.out.println(personVo.getName()+"\t"+
                personVo.getAge()+"\t"+
                personVo.getPhone());
    }
}
