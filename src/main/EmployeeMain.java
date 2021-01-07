package main;
import databean.Employee;
import java.util.Scanner;
import java.util.Arrays;

//step 5
public class EmployeeMain {
    //step 6
    public static void main(String[] args) {
        //step 7
        //creating array of Employee
        Employee[] arr = new Employee[5];
        //checking default values of indexes in array
        System.out.println(Arrays.toString(arr));
        //step 8
        //scanner for user input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Employee employee = new Employee();
            System.out.println("Enter first name : ");
            employee.setFirstname(sc.nextLine());
            System.out.println("Enter last name : ");
            employee.setLastname(sc.nextLine());
            System.out.println("Enter salary : ");
            employee.setSalary(sc.nextDouble());
            System.out.println("Enter empId : ");
            employee.setEmpId(sc.nextInt());
            System.out.println("Enter experience : ");
            employee.setExperience(sc.nextDouble());
            System.out.println("Enter mobile no. : ");
            employee.setMobile(sc.nextLong());
            sc.nextLine();
            System.out.println("Enter email : ");
            employee.setEmail(sc.nextLine());
            //step 9
            arr[i] = employee;
        }
        System.out.println(Arrays.toString(arr));
        //calling sortSalaryOrder()
        Employee[] sorted = sortSalaryOrder(arr);
        System.out.println("Sorted array on basis of salary");
        System.out.println(Arrays.toString(sorted));
        //calling sortExperienceOrder()
        sortExperienceOrder(arr);
        System.out.println("Sorted array on basis of experience");
        System.out.println(Arrays.toString(arr));
    }
        //step 10
        //sorting by salary in descending order
        public static Employee[] sortSalaryOrder(Employee[] arr){
            Employee[] response = arr.clone();
            for (int i = 0; i < response.length; i++) {
                for (int j = 0; j < response.length-1; j++) {
                    if(response[j].getSalary() < response[j+1].getSalary()){
                        //swapping
                        Employee temp = response[j];
                        response[j] = response[j+1];
                        response[j+1] = temp;
                    }
                }
            }
            return response;
    }
    //sorting by experience in descending order
    //different approach
    public static void sortExperienceOrder(Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].getExperience() < arr[j + 1].getExperience()) {
                    //swapping
                    Employee temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
