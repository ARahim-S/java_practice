package day04.advancedpractice01;

import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Q05_Regex_StringManipulation {
        /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız.
       Ad ayrı, soyad ayrı sekilde ekrana yazdırınız.
       Örnek:
          Ad: Ali
          Soyad: Can
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        int whiteSpaceIndex = fullName.indexOf(" ");
        System.out.println(whiteSpaceIndex);
        String firstName = fullName.substring(0,whiteSpaceIndex);
        String lastname = fullName.substring(whiteSpaceIndex+1);
        System.out.println("firstName = " + firstName);
        System.out.println("lastname = " + lastname);

        //Second way
        //String firstname = fullName.split(" ")[0];
        //String lastname = fullName.split(" ").[1];

    }
}
