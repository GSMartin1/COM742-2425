import org.junit.Test;

import static org.junit.Assert.*;
public class Main1Test {
        Main1 mn = new Main1();
        @Test
        public void print() {
            assertEquals("Hello!", mn.print("Hello!"));
        }
}