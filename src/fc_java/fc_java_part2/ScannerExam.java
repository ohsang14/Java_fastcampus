package fc_java.fc_java_part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("책의 재목을 입력하세요: ");
        String title = sc.nextLine();
        System.out.println("title = " + title);

        System.out.println("책의 가격을 입력하세요: ");
        int price = sc.nextInt();
        System.out.println("price = " + price);

        sc.nextLine();

        System.out.println("책의 출판사를  입력하세요: ");
        String company = sc.nextLine();
        System.out.println("company = " + company);


        System.out.println("책의 저자을 입력하세요: ");
        String author = sc.nextLine();
        System.out.println("author = " + author);

        System.out.println("페이지수를 입력하세요: ");
        int page = sc.nextInt();
        System.out.println("page = " + page);

        sc.nextLine();

        System.out.println("ISBN:");
        String isbn = sc.nextLine();
        System.out.println("isbn = " + isbn);

        sc.close();
    }
}
