package fc_java.fc_java_part2;

public class MoveTest {
    public static void main(String[] args) {
        // Q. 아래에 예시된 한 편의 영화 데이터를 저장하고 출력하시오.
        Movie mv = new Movie();
        mv.mtitle = "아바타";
        mv.mday = "2022.12.14";
        mv.mmajor = "제이크 셜리";
        mv.mpart = "액션";
        mv.mtime = 192;
        mv.mlevel = 12;

        System.out.println(mv.mtitle);
        System.out.println(mv.mday);
        System.out.println(mv.mmajor);
        System.out.println(mv.mpart);
        System.out.println(mv.mtime);
        System.out.println(mv.mlevel);
    }
}
class Movie{
    public String mtitle;
    public String mday;
    public String mmajor;
    public String mpart;
    public int mtime;
    public int mlevel;

}
