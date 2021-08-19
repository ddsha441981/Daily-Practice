package streamss;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryDetails {
    public static void main(String[] args) {

        List<Employee> eList = Arrays.asList (
                new Employee(1,"AA",Gender.MALE,5000),
                new Employee(2,"BB",Gender.FEMALE,15000),
                new Employee(3,"CC",Gender.MALE,10000),
                new Employee(4,"dd",Gender.FEMALE,20000),
                new Employee(5,"EE",Gender.MALE,2000),
                new Employee(6,"FF",Gender.FEMALE,3000)
        );

//        Filtering data by using salary
        eList.stream()
                .filter(x->x.getEmpSalary() <= 5000)
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        Getting All Employees
       eList.stream().map(Employee::getEmpName).forEach(System.out::println);

//       Find By Id Of Employee
        System.out.println(
        eList.stream().filter(x->x !=null).filter(x->x.getEmpSalary()<5000).findAny().orElse(null)
        );

    }
}
