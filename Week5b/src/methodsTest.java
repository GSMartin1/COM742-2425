import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class methodsTest {
    methods mn = new methods();
    @Test
    void numSeq() {
        assertEquals(1, mn.numSeq(1));
        assertEquals(4, mn.numSeq(2));
        assertNotEquals(7, mn.numSeq(3));
    }
}