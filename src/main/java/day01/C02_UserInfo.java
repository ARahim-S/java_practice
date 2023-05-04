package day01;

public class C02_UserInfo {

    /*
    isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki
    gibi yazdıran bir kod yazınız:
       Isim: ...
       Soyisim: ...
       Yas: ...
       Boy: ...
       Kilo: ...
   Not: Sadece bir adet "System.out.println(); kullanınız.
   */
    public static void main(String[] args) {
        String firstName, lastName;
        int age;
        double height, weight;

        firstName = "Ali";
        lastName = "Doe";
        age = 36;
        height = 1.77;
        weight = 89.1;

        //\n ==> line next demektir.

        // ctrl + alt + l ==> kodlarımızı düzene koyabiliriz.

        System.out.println("Firstname: " + firstName +
                "\n" + "LastName: " + lastName + "\n" +
                "Age: " + age + "\n" + "Height: " + height
                + "\n" + "Weight: " + weight);
    }
}
