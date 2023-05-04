package day01;

public class C05_MethodCreation {
    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
    public static void main(String[] args) {
        resultWrite(548756, 25);  //argument diyoruz.
    }

    public static void resultWrite(int a, int b) {
        //methoda verdiklerimize parametre diyoruz
        int doubledA, doubledB, result;
        doubledA = a * a;
        doubledB = b * b;
        result = doubledA + doubledB;
        System.out.println("result = " + result);
    }
}
