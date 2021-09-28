package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void generatePassword() {
        //correct length password
        assertTrue( PasswordGenerator.generatePassword( 8, 2, 2).length() >= 8);
    }

    @Test
    void generateRandomNumber() {
        assertFalse(PasswordGenerator.generateRandomNumber(0, 3) > 2);
        assertFalse(PasswordGenerator.generateRandomNumber(0, 3) < 0);
    }

}