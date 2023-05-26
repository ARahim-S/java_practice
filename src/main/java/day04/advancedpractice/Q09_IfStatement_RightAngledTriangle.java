package day04.advancedpractice;

import java.util.Scanner;

public class Q09_IfStatement_RightAngledTriangle {
        /*
        Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        (Not: Bir üçgenin dik olduğunu anlamak için a^2 + b^2 = c^2 pisagor bağlantısından yararlanabilirsiniz)
    */

    // Ödev-1: Soruyu If Statement kullanarak çözünüz.
    // Ödev-2: Dik üçgen hesaplamasını yapan bir metot oluşturun ve kullanın.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number for triangle");
        double firstEdge = input.nextDouble();
        System.out.println("Please enter number for triangle");
        double secondEdge = input.nextDouble();
        System.out.println("Please enter number for triangle");
        double thirdEdge = input.nextDouble();

        isRightAngledTriangle(firstEdge, secondEdge, thirdEdge);
    }

    private static void isRightAngledTriangle(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("this is a triangle");
                if (c > b && c > a) {
                    if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
                        System.out.println("this is right angled triangle");
                    } else {
                        System.out.println("this is not a right angled triangle");
                    }
                } else if (b > c && b > a) {
                    if (Math.pow(b, 2) == Math.pow(c, 2) + Math.pow(a, 2)) {
                        System.out.println("this is right angled triangle");
                    } else {
                        System.out.println("this is not a right angled triangle");
                    }
                } else if (a > c && a > b) {
                    if (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2)) {
                        System.out.println("this is right angled triangle");
                    } else {
                        System.out.println("this is not a right angled triangle");
                    }
                }else{
                    System.out.println("this is not a right angled triangle");
                }
            } else {
                System.out.println("this is not a triangle");
            }

        } else {
            System.out.println("please enter positive numbers");
        }

    }
}
