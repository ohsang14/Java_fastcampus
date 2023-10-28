package fc_java.fc_java_part3;

public class StaticTest {
    public static void main(String[] args) {
        //Q. 매개변수 2개의 정수를 입력받아서 총합을 구하는 리턴 메서드를 정의.
        int a = 10;
        int b = 20;
        // a + b =??
        int sum = StaticTest.hap(a, b);
        System.out.println("sum : " + sum);
    }

    public static int hap(int a, int b) {
        int v = a + b;
        return v;
    }
}
