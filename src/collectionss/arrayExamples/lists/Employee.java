package collectionss.arrayExamples.lists;

public class Employee {
    double empId;
    String empName;

    public Employee(double empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public double getEmpId() {
        return empId;
    }

    public void setEmpId(double empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
