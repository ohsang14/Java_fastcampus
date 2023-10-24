package fc_java.fc_java_part2;

public class ArrayMake {
    public static void main(String[] args) {
        // Q. [정수 5개]를 저장 할 [배열을 생성] 하시오.

        int[] a = new int[5];
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        float[] f = new float[5]; // 배열은 길이가 고정.


        Book[] b = new Book[3]; // 책 3권을 저장할 배열을 생성
    }
}
