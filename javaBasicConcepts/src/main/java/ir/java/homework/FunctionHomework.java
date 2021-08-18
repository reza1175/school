package ir.java.homework;

public class FunctionHomework {

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrimeWithDoWhile(int num) {
        int i = 2;
        do {
            if (num % i == 0) {
                return false;
            }
        } while (++i < num);
        return true;
    }

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

    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(String.valueOf(a+"*"+b+"="+b * a + "\t"));
            }
            System.out.println();
        }
    }
}