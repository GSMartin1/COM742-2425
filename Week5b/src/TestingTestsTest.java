import org.junit.Test;

import static org.junit.Assert.*;

public class TestingTestsTest {
    TestingTests testingTests = new TestingTests();

    @Test
    public void main() {
    }

    @Test
    public void printTest() {
        assertEquals("Hi", TestingTests.printTest("Hi"));
    }
}