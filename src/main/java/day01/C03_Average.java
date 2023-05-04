package day01;

public class C03_Average {

    /*
     double num1 = 23.4;
     double num2 = 24.0;
     double num3 = 12;
     double num4 = 450.3;
     double num5 = 100;

    Bu sayıların ortalamasını hesaplayan bir kod yazınız.
  */
    public static void main(String[] args) {
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

        System.out.println(averageValue(num1, num2, num3, num4, num5));
    }
    //ctrl alt l ==> kodları düzenler

    public static double averageValue(double a, double b, double c, double d, double e) {
        double result;
        result = (a + b + c + d + e) / 5;
        return result;
    }
}
