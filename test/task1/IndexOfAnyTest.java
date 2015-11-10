package task1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static task1.IndexOfAny.indexOfAny;

public class IndexOfAnyTest {

    @Test
    public void emptyStringTest() {
        assertEquals(-1, indexOfAny("", new char[]{'a', 'b'}));
    }

    @Test
    public void testNoOccurrences() {
        assertEquals(-1, indexOfAny("abcde", new char[]{'g', 'h'}));
    }

    @Test
    public void testSingleOccurrences() {
        assertEquals(1, indexOfAny("abcde", new char[]{'b', 'f'}));
        assertEquals(1, indexOfAny("abcde", new char[]{'f', 'b'}));
        assertEquals(0, indexOfAny("abcde", new char[]{'a'}));
        assertEquals(4, indexOfAny("abcde", new char[]{'e'}));
    }

    @Test
    public void testMultipleOccurrences() {
        assertEquals(0, indexOfAny("baaaa", new char[]{'a', 'b'}));
    }
}