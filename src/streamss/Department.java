package streamss;

public class Department {

    private long dId;
    private String dName;
    private Employees employees;

    public Department(long dId, String dName, Employees employees) {
        this.dId = dId;
        this.dName = dName;
        this.employees = employees;
    }

    public long getdId() {
        return dId;
    }

    public void setdId(long dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", employees=" + employees +
                '}';
    }
}

class Employees{
    private long eId;
    private String eName;
    private double salary;

    public Employees(long eId, String eName, double salary) {
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }

    public long geteId() {
        return eId;
    }

    public void seteId(long eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
