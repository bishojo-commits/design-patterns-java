package com.bishojo.designpatterns.composite;

import com.bishojo.designpatterns.composite.employee.Concierge;
import com.bishojo.designpatterns.composite.employee.Employee;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConciergeTest extends AbstractStreamTest {

    private final Employee concierge = new Concierge(100, "Alice", "Test Concierge");

    @Test
    public void testConciergeDetailsArPrinted() {
        concierge.showEmployeeDetails();

        Assertions.assertTrue(outContent.toString().contains("100"));
        Assertions.assertTrue(outContent.toString().contains("Alice"));
        Assertions.assertTrue(outContent.toString().contains("Test Concierge"));
    }
}
