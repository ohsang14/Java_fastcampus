package fc_java.fc_java_part3;

import fc_java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동 해야 되는 경우를 생각해보자?
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
        carInfoPrint(car);
    }
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn);
        System.out.println(car.carName);
        System.out.println(car.carPrice);
        System.out.println(car.carOwner);
        System.out.println(car.carYear);
        System.out.println(car.carOil);
    }
}
