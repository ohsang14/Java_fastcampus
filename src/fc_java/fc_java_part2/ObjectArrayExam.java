package fc_java.fc_java_part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        Movie1[] m = new Movie1[3];
        m[0] = new Movie1();
        m[0].name = "어벤저스";
        m[0].price = 10000;
        m[0].type = "액션";


        System.out.println(m[0].name);
        System.out.println(m[0].price);
        System.out.println(m[0].type);
    }
}
class Movie1 {
    public static String name;
    public static int price;
    public static String type;
}
