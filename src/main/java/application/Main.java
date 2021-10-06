package application;

import homework.FunctionHomework;

public class Main {

    public static void main(String[] args) {
        FunctionHomework homework = new FunctionHomework();

        System.out.println(homework.isPrime(1000000005));
        System.out.println(homework.isPrimeWithDoWhile(11));
        homework.printPrimes(1000);
        String listOfPrims = homework.getPrimes(101);
    }
}
