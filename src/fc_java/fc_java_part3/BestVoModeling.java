package fc_java.fc_java_part3;

import fc_java.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        MovieVO movieVO = new MovieVO("아바타",20221214,"제이크 셜리",
                "액션",192,12);

        System.out.println(movieVO);
    }
}
