package streamss;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DublicateSteam {
    public static void main(String[] args){

        List<String> aList = Arrays.asList("Hello" , "World");

        aList.stream()
                .map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

       aList.stream().map(String::length).collect(Collectors.toList()).forEach(System.out::println);


    }
}
