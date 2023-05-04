package day01;

public class C04_MethodCreation {
        /*
            hello world
            Hello World
            HEllo WOrld
            HELlo WORld
            HELLo WORLd
            HELLO WORLD
           */

    public static void main(String[] args) {
       outputHello();
       outputHello();
       outputHello();
    }

    public static void outputHello() {
        System.out.println("hello world\n" +
                "Hello World\n" +
                "HEllo WOrld\n" +
                "HELlo WORld\n" +
                "HELLo WORLd\n" +
                "HELLO WORLD");

    }

    //bir kodu birden fazla kullanmam gerekiyorsa method oluşturur istediğim zaman main methodda çağırırım
}
