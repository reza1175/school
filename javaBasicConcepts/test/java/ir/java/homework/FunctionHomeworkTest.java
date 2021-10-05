package ir.java.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.plaf.IconUIResource;

import java.util.Arrays;
import java.util.List;

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

    @Test
    public void test_getDay() {
        assertEquals(DayType.UNKNOWN, underTest.getDay(0));
        assertEquals(DayType.SUNDAY, underTest.getDay(1));
        assertEquals(DayType.UNKNOWN, underTest.getDay(-1));
    }

    @Test
    public void test_createMultiplicationTable() {
        System.out.println(underTest.createMultiplicationTable());
    }

    @Test
    void name() {
        int a[] = {1,2,3};
        underTest.changeList(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}

