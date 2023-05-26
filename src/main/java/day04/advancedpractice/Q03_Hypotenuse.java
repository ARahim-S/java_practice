package day04.advancedpractice;

public class Q03_Hypotenuse {

        /*
       Write a code calculate the Hypotenuse
       Formul: Square root(a*a + b*b)
        */

    public static void main(String[] args) {
        double a = 8;
        double b = 5;

        double hypotenuse = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("hypotenuse = " + hypotenuse);

    }
}
