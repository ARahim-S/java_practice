package day01;

public class C06_MethodCreation {
    //kare prizmanın hacmini bulan ve donduren bir method yazınız
    //volume= a*a*h
    public static void main(String[] args) {
        int result = volumeSquarePrism(3, 4);
        System.out.println("result = " + result);
    }

    public static int volumeSquarePrism(int a, int h) {
        return a * a * h;
    }
}
