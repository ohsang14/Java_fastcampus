package fc_java.model;

public class CarDAO {
    // C.R.U.D
    // Creat = insert(저장)
    public void carInsert(CarDTO car){
        // DB연결, insert SQL
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }
    public void carSelect(){
        // Select SQL
        System.out.println("car 정보가 DB에 출력이 되었습니다.");
    }

}
