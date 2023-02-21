import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestWordTest {
    @Test
    public void test(){
        assertEquals("time", new LongestWord().LongestWord("fun&!! time"));
        assertEquals("love", new LongestWord().LongestWord("I love dogs"));
        assertEquals("world123", new LongestWord().LongestWord("Hello world123 567"));
        assertEquals("reprehenderit", new LongestWord().LongestWord("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."));



    }
}
