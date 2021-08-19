package threading.executorServices;

public class EmpList {
    long salary;
    String empName;

    public EmpList(long salary, String empName) {
        this.salary = salary;
        this.empName = empName;
    }

    public long getSalary() {
        return salary;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "EmpList{" +
                "salary=" + salary +
                ", empName='" + empName + '\'' +
                '}';
    }
}
