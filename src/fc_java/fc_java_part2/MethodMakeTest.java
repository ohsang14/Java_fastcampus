package fc_java.fc_java_part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int result = add(3,5);
        System.out.println("result : " + result);
    }
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

}
