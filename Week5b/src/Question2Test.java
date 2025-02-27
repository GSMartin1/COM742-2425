import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {
    Question2 qn = new Question2();
    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, qn.CelsiusToFahrenheit(0));
    }
}