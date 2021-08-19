package streamss;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpTest {
    public static void main(String[] args) {
        List<Employee> aList = Arrays.asList(
                new Employee(1, "Deendayal", Gender.MALE, 58200),
                new Employee(2, "Kapil", Gender.MALE, 50200),
                new Employee(3, "Anil", Gender.MALE, 20000),
                new Employee(4, "Priya", Gender.FEMALE, 30000),
                new Employee(5, "Fahreen", Gender.FEMALE, 25000)
        );

        aList.forEach((elements) -> System.out.println(elements));

        //Sorting By Using lambda
        Comparator<Employee> comp = (e1, e2) -> {
            return e1.getEmpName().compareTo(e2.getEmpName());
        };
        Collections.sort(aList, comp);
        System.out.println("-----------------------------Sorting By Using lambda-----------------------------------------");
        System.out.println(aList);

        //Sorting By Using Method Referance
        System.out.println("------------------Sorting By Using Method Referance--------------------------");
        Collections.sort(aList, Comparator.comparing(Employee::getEmpName));
        System.out.println(aList);

        //Check salary of employee
        System.out.println("------------------Salary Operation By using Predicate interface--------------------------");
        Predicate<Employee> predicate = x -> x.getEmpSalary() > 20000;
        for (Employee empList : aList) {
            if (predicate.test(empList))
                System.out.println(empList.getEmpSalary());
        }

        //Checking Salary By Using Stream API
        System.out.println("------------------Salary Operation By using Stream API--------------------------");
        List<Employee> aList2 = aList.stream().filter(x -> x.getEmpSalary() < 40000).collect(Collectors.toList());
//        System.out.println(aList2);
        aList2.forEach((element -> System.out.println(element)));

        System.out.println("------------------Employee Gender By using Predicate--------------------------");
//        aList.stream().filter(x -> x.getEmpName().contains("A").collect(Collectors.toList());
        Predicate<Employee> p = x -> x.getEmpName().contains("A");
        for (Employee employee : aList) {
            if (p.test(employee))
                System.out.println(employee.getEmpName());
        }

        System.out.println("------------------Copy Array in single Array -------------------------");
        List<String> aList11 = Arrays.asList("A", "B", "C");
        List<String> aList22 = Arrays.asList("D", "E", "C");
        List<String> aList33 = Arrays.asList("F", "F");

        Map<String, List<Integer>> map = new HashMap();
        map.put("One", Arrays.asList(1, 2, 3));
        map.put("two", Arrays.asList(4, 5, 6));
        map.put("three", Arrays.asList(7));

        List<String> collectList = Stream.of(aList11, aList22, aList33).flatMap(List::stream).collect(Collectors.toList());
        Set<String> collectSet = Stream.of(aList11, aList22, aList33).flatMap(List::stream).collect(Collectors.toSet());
        List<Integer> collectMap = map.values().stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(collectList);
        System.out.println(collectSet);
        System.out.println(collectMap);


        long c = Stream.of(10, 20, 30, 40, 50).filter(x -> x < 50).count();
        System.out.println(c);

         Stream.of("Java", "JavaScript", "Python", "Dart", "PHP", "Spring")
                .filter(x -> x.contains("J"))
                .map(String::toUpperCase)
                 .forEach(System.out :: println);

    }


}
