package streamss;

public class Employee {

    int empId;
    String empName;
    Gender gender;
    double empSalary;

    public Employee(int empId, String empName, Gender gender, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Gender getGender() {
        return gender;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender=" + gender +
                ", empSalary=" + empSalary +
                '}';
    }
}
