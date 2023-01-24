import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockPickerTest {
    @Test
    public void test1(){
        assertEquals(5, StockPicker.stockPicker(new int[]{10, 12, 4, 5, 9}));

    }
    @Test
    public void test2() {
    assertEquals(-1, StockPicker.stockPicker(new int[]{10, 9, 8, 2}));
    }
    @Test
    public void test3() {
        assertEquals(16, StockPicker.stockPicker(new int[]{44, 30, 24, 32, 35, 30, 40, 38, 15}));
    }



}
