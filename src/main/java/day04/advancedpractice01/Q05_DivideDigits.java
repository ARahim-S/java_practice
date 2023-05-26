package day04.advancedpractice01;

public class Q05_DivideDigits {
        /*
        Write code that parsing numbers of the digits

        Hint: Use / ve %
        Number: 12345
        Output: 1
               2
               3
               4
               5
    */
        public static void main(String[] args) {
            int number = 12345;
            int unitsDigit = number % 10;
            int tensDigit = (number / 10) % 10;
            int hundredsDigit = (number / 100) % 10;
            int thousandsDigit = (number / 1000) % 10;
            int tenThousandDigit = number / 10000;
            System.out.println(tenThousandDigit  + "\n" + thousandsDigit  + "\n" + hundredsDigit + "\n" + tensDigit + "\n" + unitsDigit);
        }


}
