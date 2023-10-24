package fc_java.fc_java_part3;

import fc_java.model.CarDAO;
import fc_java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장을 하세요.
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 번호를 입력하세요");
        int carS = sc.nextInt();

        sc.nextLine();
        System.out.println("자동차 이름 입력하세요");
        String carName = sc.nextLine();

        System.out.println("자동차 가격를 입력하세요");
        int carPrice = sc.nextInt();

        sc.nextLine();

        System.out.println("자동차 소유자를 입력하세요");
        String carOwner = sc.nextLine();

        System.out.println("자동차 년식을 입력하세요");
        int carYear = sc.nextInt();

        sc.nextLine();

        System.out.println("자동차의 타입을 입력하세요: ");
        String carOil = sc.nextLine();

//        System.out.println(carS + "\t" + carName + "\t" +
//                carPrice + "\t" + carOwner + "\t" +
//                carYear + "\t" + carOil);

        CarDTO car = new CarDTO();
        car.carSn = carS;
        car.carName=carName;
        car.carPrice = carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carOil=carOil;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
