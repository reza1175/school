package ir.java.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.plaf.IconUIResource;

import static org.junit.jupiter.api.Assertions.*;

class FunctionHomeworkTest {
    FunctionHomework underTest = new FunctionHomework();


    @ParameterizedTest
    @ValueSource(ints = {20, 30, 45, 56, 9, 15, 35, 36, 99, 91})
    void should_return_false_if_numbers_are_not_primes(int numbers) {
        boolean actual = underTest.isPrime(numbers);

        assertFalse(actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 17, 41, 13, 7})
    void should_return_true_if_numbers_are_primes(int numbers) {
        boolean actual = underTest.isPrime(numbers);

        assertTrue(actual);
    }

    @Test
    void test_basic_operation() {
        long a = 12;
        int b = 66;
        int c = 66;
        char myChar = 'A';
        b = (int) a;
        assertEquals(12, b);

        System.out.println(myChar);
        b = myChar;

        assertEquals(65, b);
        myChar = (char) c;
        System.out.println(myChar);
    }

    @Test
    void test_break_continue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print("[ ] ");
                continue;
            }
            System.out.print("[" + i + "] ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.print("[ ] ");
                break;
            }
            System.out.print("[" + i + "] ");
        }
        System.out.println();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 5, 6, 8, 2, 14, 6})

    public void test_switch(int num) {


        switch (num) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;

            default:
                System.out.println("THe Num You Add , Is Fuels");

        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2})
    public void multiplication(int a, int b) {

        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                System.out.print(String.valueOf(a * b));
            }
            System.out.println();
        }
    }


}

