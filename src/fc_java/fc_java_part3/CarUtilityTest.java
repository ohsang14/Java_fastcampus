package fc_java.fc_java_part3;

import fc_java.model.CarDTO;
import fc_java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고있는 Utility클래스를 설계하세요.
        int carSn = 0450;
        String carName = "아반떼";
        int carPrice = 250000000;
        String carOwner = "오상현";
        int carYear = 2017;
        String carOil = "휘발류";

        CarDTO carDTO = new CarDTO();
        carDTO.carSn = carSn;
        carDTO.carName = carName;
        carDTO.carPrice = carPrice;
        carDTO.carOwner = carOwner;
        carDTO.carYear = carYear;
        carDTO.carOil = carOil;

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(carDTO); // carDTO를 전달
    }
}
