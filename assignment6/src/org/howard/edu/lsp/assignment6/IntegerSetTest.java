package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Rya McKinnon  student id 
 * @03056867
 * used example and google for starter code, used chat gpt for debugging
 */


public class IntegerSetTest {
    @Test
    @DisplayName("Test add and length methods")
    public void testAddAndLength() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test equals method")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1); set1.add(2);
        set2.add(2); set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test largest exception")
    public void testLargestException() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> {
            set.largest();
        });
    }

    @Test
    @DisplayName("Test smallest exception")
    public void testSmallestException() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> {
            set.smallest();
        });
    }

    @Test
    @DisplayName("Test contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        assertTrue(set.contains(3));
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(5);
        assertFalse(set.isEmpty());
    }
}
