package day01;

public class C01_Variables {
    public static void main(String[] args){
        int number = 10;
        int numberFirst = number;
        System.out.println(number);
        System.out.println(numberFirst);
        int age, count;
        age=36;
        count=25;
        /*
        Variable üzerine sağ tıklayıp refactor rename deyip all
        occurance seçersek her yerde değişken adı değişecektir.
         */

        System.out.println(age + "-" + count);

        String firstName = "ali", lastName="yilmaz";
        System.out.println(firstName + " " + lastName);

        //soutv kısayolu değişkeni etiketiyle birlikte yazdırma işlemi yapar.
        System.out.println("firstName = " + firstName);

        //Oluşturduğun variable'ı farklı bir variable'a kopyala
        int myAge = age;
        System.out.println("myAge = " + myAge);

        /*
        Yazım şekilleri;
        camelCase
        PascalCase
        snake_case
        kebap-case
         */

        //Aynı satırda çoklu variable deklare et
        int year=2023, month=4, day=21;
        System.out.println("year = " + year);
        //year.soutv dersek etiketi ile birlikte yazdırabiliriz.
        //bir variable 2 süslü parantez içerisinde bir kere tanımlayabiliriz. (scope area)

        //java yukarıdan aşağıya soldan sağa şeklinde çalışır.
        //JAVA runtime programdır. çalışırken programlama yapar değerleri atar. bitince sıfırlar.


        //Bir variable deklere et : x
        double x;

        //Bir variable baslat : y
        double y =12.5;

        //Başka bir variable başlat : z

        double z = 33;// java bunu 33.0 olarak algıladı

        //x degişkenini y degişkeni ile başlat
        x=y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Variable y'i guncelle

        y=14.9; // y variable ını güncelle
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
