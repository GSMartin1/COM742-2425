import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question5Test {
    Question5 q5 = new Question5();

    @Test
    void sumArray() {
        assertEquals(15, q5.sumArray(new int[]{1,2,3,4,5}));

    }

    @Test
    void shiftArray() {
        assertArrayEquals(new int[]{-1,1,2,3,4}, q5.shiftArray(new int[]{1,2,3,4,5}));
    }
}