package fc_java.fc_java_part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a = 10;
        double f = 35.6;
        boolean b = false;
        char c = 'A';
        String s = "APPLE";

        // Q. 69를 10진수, 2진수 , 8진수 ,16진수로 출력하시오
        int decimal = 69;
        System.out.println("decimal: " + decimal);
        int binary = 0b01000101;
        System.out.println("binary:  " + binary);
        int octal = 0105;
        System.out.println(octal);
        int hexa = 0x45;
        System.out.println(hexa);


    }
}
