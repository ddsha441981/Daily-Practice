package streamss;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PredicateTest {

    public static void main(String[] args) {

        List<Bike> aBike = Arrays.asList(
                new Bike(01, "Splender Plus", "Hero", 75000),
                new Bike(02, "Shine", "Honda", 82000),
                new Bike(03, "Classic 350", "Royal Enfield", 165000),
                new Bike(04, "Plusher", "Bajaj", 95000),
                new Bike(05, "Apache", "TVS", 150000)
        );

        aBike.forEach((element) -> System.out.println(element));


//        Predicate interface
        Predicate<Bike> predicate = x -> x.getPrice() > 100000;
        for (Bike bike : aBike) {
            if (predicate.test(bike));
            System.out.println(bike.getBikeName());//classic 350 Apache
        }

//        Using Stream Api Internally use predicate interface
        System.out.println("------------------Using Stream API-----------------------");
        List<Bike> aBike2 = aBike.stream().filter(a -> a.getPrice() < 90000)
                .collect(Collectors.toList());
        System.out.println(aBike2);


//        //sorting
//        Comparator<Bike> com = (e1,e2)->{
//            return e1.getBikeName().compareTo(e2.getCompanyName());
//        };
//
////        Collections.sort(aBike,com);
//
//        Collections.sort(aBike, Comparator.comparing(Bike :: getBikeName));
//
//        System.out.println(aBike);
    }
}
