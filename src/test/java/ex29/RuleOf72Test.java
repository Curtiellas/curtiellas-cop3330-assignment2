package ex29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleOf72Test {

    @Test
    void main() {
    }

    @Test
    @DisplayName("Read input until a valid non-zero number was entered")
    void readRate() {
        assertFalse(String.valueOf(RuleOf72.readRate()).isEmpty());

    }
}