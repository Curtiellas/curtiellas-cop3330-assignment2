package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingNumbersTest {

    @Test
    void addNumbers() {
        assertEquals(15, AddingNumbers.addNumbers(new int[]{1, 2, 3, 4, 5}));
        assertEquals(6, AddingNumbers.addNumbers(new int[]{0, 2, 0, 4, 0}));
        assertEquals(-2, AddingNumbers.addNumbers(new int[]{1, -2, 3, -9, 5}));
    }
}