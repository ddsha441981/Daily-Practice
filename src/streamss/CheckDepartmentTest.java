package streamss;

import java.util.*;
import java.util.stream.Collectors;

public class CheckDepartmentTest {

    public static void main(String[] args) {

        List<Department> dList = Arrays.asList(
                new Department(101,"IT",new Employees(01,"Deendayal",58200)),
                new Department(102,"HR",new Employees(02,"A",58200)),
                new Department(103,"IT",new Employees(03,"B",58200)),
                new Department(104,"Accounts",new Employees(04,"C",58200)),
                new Department(105,"IT",new Employees(05,"D",58200))
        );
//        dList.forEach(System.out::println);

        Map<String , List<Employees>> map = new HashMap();
        dList.stream().forEach(x ->{
            map.computeIfAbsent(x.getdName(),xx-> new ArrayList<Employees>())
                    .add(x.getEmployees());
        });
        System.out.println(map);
    }
}
