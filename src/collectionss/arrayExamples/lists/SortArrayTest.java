package collectionss.arrayExamples.lists;

import java.util.*;

public class SortArrayTest {
    public static void main(String[] args) {
        System.out.println("Sorting Array by using Stream API");
        List<Employee> aEmployeeList = new ArrayList<Employee>();

        aEmployeeList.addAll(Arrays.asList(
                new Employee(2001, "Deendayal"),
                new Employee(2002, "Sunil"),
                new Employee(2003, "Mukesh"),
                new Employee(2004, "Shiv Jeet"),
                new Employee(2005, "Prashant"),
                new Employee(2006, "Kapil")
        ));
//        System.out.println(aEmployeeList);

//        By Using Stream API Method
        aEmployeeList.forEach((element) -> System.out.println(element));

//        1st Approach
//        Now Sorting by using anonymous class
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getEmpName().compareTo(o2.getEmpName());
            }
        };


        //    Second Approach Lambda Expressions
        Comparator<Employee> comp  = (e1,e2) -> {
            return e1.getEmpName().compareTo(e2.getEmpName());
        };

            

        Collections.sort(aEmployeeList, comparator);
        Collections.sort(aEmployeeList, comp);

        // 3rd Approach By Using method referance Class Name :: Method Name
        Collections.sort(aEmployeeList , Comparator.comparing(Employee::getEmpName));

//        Print
        System.out.println("1st Approach By Using Anonymous Class " + aEmployeeList);
        System.out.println("2nd Approach By Using Lambda Expression " + aEmployeeList);
        System.out.println("3rd Approach By Using Method Reference " + aEmployeeList);
    }

}
