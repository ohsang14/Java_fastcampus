package fc_java.fc_java_part2;

public class MaxMinvalue {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        // min value
        int min = (a<b)?a:b;
        System.out.println("min: " + min);

        int max = (a>b)?a:b;
        System.out.println("max: " + max);
    }
}
