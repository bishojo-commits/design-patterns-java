package com.bishojo.designpatterns.composite;

import com.bishojo.designpatterns.composite.employee.Concierge;
import com.bishojo.designpatterns.composite.employee.Developer;
import com.bishojo.designpatterns.composite.employee.Employee;
import com.bishojo.helpers.AbstractStreamTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectoryTest extends AbstractStreamTest {

    private Directory directory;

    @BeforeEach
    public void setUp() {
        this.directory = new Directory();
    }

    @Test
    public void testEmptyEmployeeListInitialized() {
        Assertions.assertEquals(0, directory.getEmployees().size());
    }

    @Test
    public void testCanAddEmployee() {
        final Employee developer = new Developer(100, "Alice", "Test Developer");

        directory.addEmployee(developer);

        Assertions.assertEquals(1, directory.getEmployees().size());
    }

    @Test
    public void testCanRemoveEmployee() {
        final Employee developer = new Developer(100, "Alice", "Test Developer");

        directory.addEmployee(developer);
        directory.removeEmployee(developer);

        Assertions.assertEquals(0, directory.getEmployees().size());
    }

    @Test
    public void testCanShowEmployeesDetails() {
        final Employee developer = new Developer(100, "Alice", "Test Developer");
        final Employee concierge = new Concierge(101, "Bob", "Test Concierge");

        directory.addEmployee(developer);
        directory.addEmployee(concierge);

        directory.showEmployeeDetails();

        Assertions.assertTrue(outContent.toString().contains("100"));
        Assertions.assertTrue(outContent.toString().contains("Alice"));
        Assertions.assertTrue(outContent.toString().contains("Test Developer"));

        Assertions.assertTrue(outContent.toString().contains("101"));
        Assertions.assertTrue(outContent.toString().contains("Bob"));
        Assertions.assertTrue(outContent.toString().contains("Test Concierge"));
    }

    @Test
    public void testCanAddFullDirectoryToEmployees() {
        final Employee developerOne = new Developer(100, "Alice", "Test Developer");
        final Employee developerTwo = new Developer(101, "Bob", "Test Developer");

        final Directory engineerDirectory = new Directory();

        engineerDirectory.addEmployee(developerOne);
        engineerDirectory.addEmployee(developerTwo);

        directory.addEmployee(engineerDirectory);

        Assertions.assertEquals(1, directory.getEmployees().size());
    }
}
