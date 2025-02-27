import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {
Question4 Q4 = new Question4();
    @Test
    public void coinPrinter1() {
        assertEquals(Q4.validCoin(1), "One penny");
    }
    @Test
    public void coinPrinter2() {
        assertEquals(Q4.validCoin(2), "Two pence");
        assertEquals(Q4.validCoin(5), "Five pence");
        assertEquals(Q4.validCoin(10), "Ten pence");
        assertEquals(Q4.validCoin(20), "Twenty pence");
        assertEquals(Q4.validCoin(50), "Fifty pence");
    }
    @Test
    public void coinPrinter3() {
        assertEquals(Q4.validCoin(100), "One pound");
        assertEquals(Q4.validCoin(200), "Two pound");
    }
    @Test
    public void coinPrinter4() {
        assertNotEquals(Q4.validCoin(2), "Invalid coin: 3");
        assertEquals(Q4.validCoin(3), "Invalid coin: 3");
    }

}