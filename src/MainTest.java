import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void longestCommonPrefix() {
        Main m = new Main();
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", m.longestCommonPrefix(strs));
        String[] strs2 = {"dog","racecar","car"};
        assertEquals("", m.longestCommonPrefix(strs2));
        String[] strs3 = {"a"};
        assertEquals("a", m.longestCommonPrefix(strs3));
        String[] strs4 = {"ab", "a"};
        assertEquals("a", m.longestCommonPrefix(strs4));
        String[] strs5 = {"cir","car"};
        assertEquals("c", m.longestCommonPrefix(strs5));
    }
}