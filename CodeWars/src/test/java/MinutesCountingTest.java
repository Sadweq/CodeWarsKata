import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinutesCountingTest {
    @Test
    public void test1() {
        assertEquals(690, MinutesCounting.CountingMinutesI("12:30pm-12:00am"));
    }
    @Test
    public void test2() {
        assertEquals(1425, MinutesCounting.CountingMinutesI("1:23am-1:08am"));
    }
    @Test
    public void test3() {
        assertEquals(1, MinutesCounting.CountingMinutesI("1:23am-1:24am"));
    }
    @Test
    public void test4() {
        assertEquals(2, MinutesCounting.CountingMinutesI("12:59pm-1:01am"));
    }
    @Test
    public void test5() {
        assertEquals(1439, MinutesCounting.CountingMinutesI("1:01am-1:00am"));
    }
}
