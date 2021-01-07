package main;
import databean.Employee;

import java.util.Arrays;

public class EmployeeMain2 {
    public static void main(String[] args) {
        //creating object of Employee to print it using system.out
        Employee employee = new Employee();
        employee.setFirstname("ABC");
        employee.setLastname("pqr");
        employee.setEmpId(1234);
        employee.setSalary(10000);
        employee.setExperience(8);
        employee.setMobile(1234567890);
        employee.setEmail("hello@gmail.com");
        System.out.println(employee);

       Employee[] arr = {employee};
        System.out.println(Arrays.toString(arr));

    }
}
