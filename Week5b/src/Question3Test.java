import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {
    @Test
    void selectionSort() {
        Question3 SS = new Question3();
        int[] list = {12, 5, 25, 16,14};
        int [] sortedList = {5, 12, 14, 16,25};
        assertArrayEquals(sortedList, SS.selectionSort(list));
    }
}