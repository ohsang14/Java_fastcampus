package fc_java.fc_java_part3;

import fc_java.model.MyUtil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        MyUtil1 myUtil1 = new MyUtil1();
        int sum = myUtil1.hap(a,b);

        System.out.println("sum1 : " + sum);
    }
}
