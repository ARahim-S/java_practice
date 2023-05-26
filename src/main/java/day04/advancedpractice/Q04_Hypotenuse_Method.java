package day04.advancedpractice;

import java.util.Scanner;

public class Q04_Hypotenuse_Method {

            /*
            Create method
            Write a code calculate the Hypotenuse
            Formul: Square root(a*a + b*b)
            */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter one edge of the triangle");
        double edgeTriangle1 = input.nextDouble();
        System.out.println("Enter second edge of the triangle");
        double edgeTriangle2 = input.nextDouble();

        double result = calcHypotenuse(edgeTriangle1,edgeTriangle2);
        System.out.println("result = " + result);
    }

    public static double calcHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}
