package com.wipro.java.java8.usecase;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Optional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeServiceTest {

    /**
     * Test 1: Adding an Employee and verifying it exists
     */
    @Test
    void testAddEmployee() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10));
        service.addEmployee(emp);
        Optional<Employee> result = service.searchEmployee(1);
        assertTrue(result.isPresent(), "Employee should be present");
        assertEquals("Alice", result.get().getEmpName(), "Employee name should be Alice");
    }

    /**
     * Test 2: Removing an Employee and checking if it’s gone
     */
    @Test
    void testRemoveEmployee() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15));
        service.addEmployee(emp);
        service.removeEmployee(2);
        assertTrue(service.searchEmployee(2).isEmpty(), "Employee should be removed");
    }

    /**
     * Test 3: Searching for an Employee by ID
     */
    @Test
    void testSearchEmployee() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22));
        service.addEmployee(emp);
        Optional<Employee> found = service.searchEmployee(3);
        assertTrue(found.isPresent(), "Employee should be found");
        assertEquals("Charlie", found.get().getEmpName(), "Employee name should be Charlie");
    }

    /**
     * Test 4: Updating Salary of an Employee
     */
    @Test
    void testUpdateSalary() {
        EmployeeService service = new EmployeeService();
        Employee emp = new Employee(4, "David", "Marketing", 55000, LocalDate.of(2022, 1, 10));
        service.addEmployee(emp);
        service.updateSalary(4, 65000);
        assertEquals(65000, service.searchEmployee(4).get().getSalary(), "Salary should be updated to 65000");
    }

    /**
     * Test 5: Retrieving Employees by Department
     */
    @Test
    void testFilterByDepartment() {
        EmployeeService service = new EmployeeService();
        Employee emp1 = new Employee(5, "Eve", "IT", 52000, LocalDate.of(2018, 6, 12));
        Employee emp2 = new Employee(6, "Frank", "HR", 48000, LocalDate.of(2017, 7, 19));
        service.addEmployee(emp1);
        service.addEmployee(emp2);
        List<Employee> filtered = service.filterByDepartment("IT");
        assertEquals(1, filtered.size(), "Only one IT employee should be found");
        assertEquals("Eve", filtered.get(0).getEmpName(), "The IT employee should be Eve");
    }

    /**
     * Test 6: Sorting Employees by Name
     */
    @Test
    void testSortByName() {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(7, "Zara", "Finance", 55000, LocalDate.of(2015, 4, 5)));
        service.addEmployee(new Employee(8, "Adam", "IT", 62000, LocalDate.of(2020, 10, 25)));
        service.addEmployee(new Employee(9, "Mike", "HR", 47000, LocalDate.of(2019, 6, 14)));

        List<Employee> sorted = service.sortByName();
        assertEquals("Adam", sorted.get(0).getEmpName(), "First employee should be Adam");
        assertEquals("Mike", sorted.get(1).getEmpName(), "Second employee should be Mike");
        assertEquals("Zara", sorted.get(2).getEmpName(), "Third employee should be Zara");
    }

    /**
     * Test 7: Calculating Average Salary
     */
    @Test
    void testGetAverageSalary() {
        EmployeeService service = new EmployeeService();
        service.addEmployee(new Employee(10, "Alex", "IT", 50000, LocalDate.of(2019, 7, 10)));
        service.addEmployee(new Employee(11, "John", "HR", 70000, LocalDate.of(2021, 3, 15)));
        service.addEmployee(new Employee(12, "Mary", "Finance", 60000, LocalDate.of(2022, 9, 20)));

        double avgSalary = service.getAverageSalary();
        assertEquals(60000, avgSalary, "Average salary should be 60000");
    }
}
