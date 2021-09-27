package ex24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AppTest {

    @Test
    void isAnagram() {
        //test = new App();
        assertTrue( App.isAnagram("good", "doog") );
        assertTrue( App.isAnagram("tone", "note") );
        assertFalse( App.isAnagram("aaa", "aa") );
        assertFalse( App.isAnagram("aa", "aaa") );
        assertFalse( App.isAnagram("oopp", "ooop") );
        assertFalse( App.isAnagram("ooop", "oopp") );

    }
}

    /*
    @BeforeEach
    public void setup() {
        test = new App();
    }

    @Test
    void main() {
    }
    */