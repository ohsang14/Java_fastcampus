package fc_java.fc_java_part2;

public class BookExam {
    public static void main(String[] args) {
        // [정수] 1개를 저장할 [변수를 선언] 하시오.
        int a;

        // Q. 책 1권을 저장할 변수를 선언하시오.
//        fc_java.fc_java_part2.Book b;
        // Q. 한 권의 책 데이터를 저장하기 위해서 객체를 생성하시오. (인스턴스를 만드시오)
        Book b = new Book();
        b.title = "자바";
        b.price = 30000;
        b.company = "패스트캠퍼스";
        b.author="박메일";
        b.page = 700;
        b.isbn = "1199110";
        System.out.println(b.title);
    }
}
