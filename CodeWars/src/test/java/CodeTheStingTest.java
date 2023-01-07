import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodeTheStingTest {
    @Test
    public void test() {
        assertEquals("3a2b1c1d1e1a", new CodeTheString().StartCoding("aaabbcdea"));
        assertEquals("1E2l1i1e1W1a1n1t1O1u1t", new CodeTheString().StartCoding("EllieWantOut"));
    }

}