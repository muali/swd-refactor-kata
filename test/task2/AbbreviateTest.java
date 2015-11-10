package task2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task2.Abbreviate.abbreviate;

public class AbbreviateTest {

    @Test
    public void testNullArg() {
        assertEquals(null, abbreviate(null, 0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalWidth() {
        abbreviate("", 0, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalWidthWithOffset() {
        abbreviate("abacabaa", 5, 6);
    }

    @Test
    public void testWithoutOffset() {
        assertEquals("aaaa", abbreviate("aaaa", 0, 4));
        assertEquals("aaa...", abbreviate("aaaaaaa", 0, 6));
    }

    @Test
    public void testWithOffset() {
        assertEquals("aaaaaaa", abbreviate("aaaaaaa", 5, 7));
        assertEquals("aaaa...", abbreviate("aaaaaaaa", 10, 7));
        assertEquals("...abcd", abbreviate("12345abcd", 5, 7));
        assertEquals("...abc...", abbreviate("12345abc12345", 5, 9));
    }

}