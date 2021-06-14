package com.bishojo.designpatterns.composite;

import com.bishojo.designpatterns.composite.employee.Concierge;
import com.bishojo.designpatterns.composite.employee.Developer;
import com.bishojo.designpatterns.composite.employee.Employee;

public class Company {
    public static void main(String[] args) {
        Employee developerOne = new Developer(100, "Alice", "Junior Developer");
        Employee developerTwo = new Developer(101, "Bob", "Senior Developer");

        Directory engineerDirectory = new Directory();

        engineerDirectory.addEmployee(developerOne);
        engineerDirectory.addEmployee(developerTwo);

        Employee conciergeOne = new Concierge(100, "Alice", "Junior Concierge");
        Employee conciergeTwo = new Concierge(101, "Bob", "Wise Old Concierge");

        Directory conciergeDirectory = new Directory();

        conciergeDirectory.addEmployee(conciergeOne);
        conciergeDirectory.addEmployee(conciergeTwo);

        Directory companyDirectory = new Directory();

        companyDirectory.addEmployee(engineerDirectory);
        companyDirectory.addEmployee(conciergeDirectory);

        companyDirectory.showEmployeeDetails();
    }
}
