package fc_java.fc_java_part2;

public class CallByReference {
    public static void main(String[] args) {
        float a =56.7f;
        float b = 78.9f;

        floatAdd(a,b);
        System.out.println("종료");
    }
    //Q. 매개변수로 2개의 실수를 받아서 / 총합을 구하여 출력하는 메서드를 정의하시오.
    public static void floatAdd(float a, float b) {
        float sum = a + b;
        System.out.println("hap = " + sum);
    }
}
