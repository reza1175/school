package ir.java.homework;

import java.util.Arrays;

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

    public String createMultiplicationTable() {
        StringBuilder result = new StringBuilder();

        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                result.append(a)
                        .append("*")
                        .append(b)
                        .append("=")
                        .append(b * a)
                        .append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public DayType getDay(int numberOfDay) {
        return switch (numberOfDay) {
            case 1 -> DayType.SUNDAY;
            case 2 -> DayType.MONDAY;
            case 3 -> DayType.TUESDAY;
            case 4 -> DayType.WEDNESDAY;
            case 5 -> DayType.THURSDAY;
            case 6 -> DayType.FRIDAY;
            case 7 -> DayType.SATURDAY;
            default -> DayType.UNKNOWN;
        };
    }
    public void changeList(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i]*10;
        }

        System.out.println("Method");
        Arrays.stream(a).forEach(System.out::println);
    }
}