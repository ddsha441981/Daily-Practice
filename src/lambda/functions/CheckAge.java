package lambda.functions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.*;

public class CheckAge {
    public static void main(String[] args){
        System.out.println("Predicate Interface \n Inside in java.util.function package \n used for Conditional Check ");
        List<Integer> aList = Arrays.asList(21,12,20,55,26,50);
        aList.forEach((x)->{
            //consumer interface example of forEach take someting and no return result
            System.out.println(x);
            });

        int max = aList.stream().max(Integer::compare).get();
        System.out.println(" Max Number " + max);

        int min  = aList.stream().min(Integer::compare).get();
        System.out.println(" Min Number " + min);

        aList.stream().sorted().forEach(System.out::println);

        aList.stream().forEach(System.out::println);

        List<Integer> collect = aList.stream().collect(Collectors.toList());
        System.out.println(collect);

        Optional<Integer> first = aList.stream().findFirst();
        System.out.println("First Element is " + first);

        System.out.println( "Even No is " +
        aList.stream().filter(x-> x%2==0).collect(Collectors.toList())
        );

        aList.stream().map(s -> s +"")//Convert Integer to String
                    .filter(s ->s.startsWith("2")).forEach(System.out::println);


    }
}
