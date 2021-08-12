package ir.java.homework;

public class Main {
    /*
        Primitive data Type
    * int - boolean - char -long- float- double- byte- ?
    int a= 10;
    String name = new String();
    instance
    * */
    public static void main(String[] args) {
        FunctionHomework homework = new FunctionHomework();

        System.out.println(homework.isPrime(1000000005));
        System.out.println(homework.isPrimeWithDoWhile(11));
        homework.printPrimes(1000);
        String listOfPrims = homework.getPrimes(101);
    }
}
