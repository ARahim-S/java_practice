package day05.advancedpractice;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_For_Continue {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler ahriç diğerlerinin toplamını bulunuz
        */

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number");
            int number = input.nextInt();
            if (number > 5 && number < 10) {
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında olduğu için dahil edilmedi");
                continue;
            }
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
