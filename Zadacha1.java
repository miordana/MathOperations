package homework;

import java.io.PrintStream;

public class Zadacha1 {
    public static void main(String[] args) {
        double a =  1.0;
        double b =  0.5;
        double c =  0.2;
        double p = Math.pow(0.7, 3);


        double a1 = 1.33 * 3.14 * Math.pow(1, 3);
        System.out.printf("result obyem shara#1 = %.2f", a1);

        double b2 = 1.33 * 3.14 * Math.pow(0.5, 3);
        System.out.printf("result obyem shara#2 = %.2f", b2);

        double c3 = 1.33 * 3.14 * Math.pow(0.2, 3);
        System.out.printf("result obyem shara#3 = %.2f", c3);

        double d = (a1 + b2 + c3) * Math.pow(0.7, 3);
        System.out.printf("double d massa snegovika = %.2f", d );


    }


}
