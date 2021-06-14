package com.bishojo.designpatterns.composite;

import com.bishojo.designpatterns.composite.employee.Developer;
import com.bishojo.designpatterns.composite.employee.Employee;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeveloperTest extends AbstractStreamTest {

    private final Employee developer = new Developer(100, "Alice", "Test Developer");

    @Test
    public void testConciergeDetailsArPrinted() {
        developer.showEmployeeDetails();

        Assertions.assertTrue(outContent.toString().contains("100"));
        Assertions.assertTrue(outContent.toString().contains("Alice"));
        Assertions.assertTrue(outContent.toString().contains("Test Developer"));
    }
}
