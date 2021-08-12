package ir.java.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

}