package fc_java.fc_java_part2;

public class VDATest {
    public static void main(String[] args) {
        //Q. [정수 : int] 한 개를 저장하기 위해서 [변수를 선언] 하시오.
        int v; // 변수 선언 - > 기억공간
        v = 10;
        System.out.println("v = " + v);

        //int a = 10;
        // int b = a;
//        int c = b * 10;
//        System. out.println(c);

//        int sum = 0;
//        sum = sum + 1;
//        sum = sum + 2;
//        System.out.println(sum);

        // 실습
        int a;
        a = 10;
        int b = a;
        int c = b * 10;
        System.out.println(c);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + 1;
        }
        System.out.println(sum);

        System.out.println("======");
        int x = 10;
        int y = 20;
        int z ;
        z = x;
        x = y;
        y = z;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
