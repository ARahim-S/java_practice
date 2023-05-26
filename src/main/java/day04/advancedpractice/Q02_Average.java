package day04.advancedpractice;

import java.text.DecimalFormat;

public class Q02_Average {
            /*
        double number1 = 23.4;
        double number2 = 24.0;
        double number3 = 12;
        double number4 = 450.3;
        double number5 = 23000;
        Calculate average of the these numbers
     */

    public static void main(String[] args) {
        double number1 = 23.4;
        double number2 = 24.0;
        double number3 = 12;
        double number4 = 450.3;
        double number5 = 23000;

        double sum = number1 + number2 + number3 + number4 + number5;
        double avg = sum / 5;
        String pattern = "##.##";
        DecimalFormat df = new DecimalFormat(pattern);
        String format = df.format(avg);
        System.out.println("format = " + format);
        //DecimalFormat class= you can format your double variables. Firstly you need a pattern for give format to the variable.
    }
}
