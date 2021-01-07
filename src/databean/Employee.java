package databean;
//step 1
public class Employee {
    //step 2
    private String firstname;
    private String lastname;
    private double salary;
    private int empId;
    private double experience;
    private long mobile;
    private String email;
    //step 3
    //using default constructor by java
    //step 4
    //create getter and setter methods for all variables
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //overriding toString() method according to custom class
    public String toString() {
        return "[ " + firstname + ", " + lastname + ", " + salary + ", " + empId + ", " + experience + ", " + email + ", " + mobile + " ]";
    }
}
