package com.bishojo.designpatterns.adapter.enumeration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationAdapterTest {
    private Enumeration<String> testEnumeration;
    private Iterator<Object> enumIterator;

    @BeforeEach
    public void setUp() {
        Vector<String> testEnum = new Vector<String>();
        testEnum.add("JAVA");
        testEnum.add("C");
        testEnum.add("PHP");

        //Create Enumeration
        testEnumeration = Collections.enumeration(testEnum);
        //Create iterator from enumeration through adapter
        enumIterator = new EnumerationAdapter(testEnumeration);
    }

    @Test
    public void testHasNext() {
        Assertions.assertTrue(enumIterator.hasNext());
    }

    @Test
    public void testNext() {
        Assertions.assertEquals("JAVA", enumIterator.next());
    }

    @Test
    public void testRemoveThrowsException() {
        Assertions.assertThrows(
                UnsupportedOperationException.class,
                () -> enumIterator.remove()
        );
    }
}
