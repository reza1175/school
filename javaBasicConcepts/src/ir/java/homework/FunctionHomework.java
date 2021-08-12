package ir.java.homework;

public class FunctionHomework {

    /*
        create a method isPrime(int num)
        It should return true or false
        You need to implement the method to recognize the number if it is prime or not
     */
    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Implement the function here

    /*
     * Write the method again with while, do-wile and for
     * */

    public boolean isPrimeWithDoWhile(int num) {
        int i = 2;
        do {
            if (num % i == 0) {
                return false;
            }
        } while (++i < num);
        return true;
    }

    /*
     * Write a method to take a number as a parameter and return all prime numbers before then
     * You can call it printPrimes(int num)
     * */
    public void printPrimes(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public String getPrimes(int num) {
        String result = "";
        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {
                result = result + i + " ,";
            }
        }
        return result;
    }


}
