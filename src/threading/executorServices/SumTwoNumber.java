package threading.executorServices;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

// Executor Framework
// 1. Executor => Interface
// 2. ExecutorService => Interface
// 3. ScheduleExecutorService => Interface
// 4. Executors => Utity Class ->  Factory method
// 5. Callable interface
// 6. Future
public class SumTwoNumber {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 5, 25, 78, 98, 28, 75, 0, 98, 23);

        List<EmpList> eList = Arrays.asList(
                new EmpList(5000, "dd1"),
                new EmpList(9000, "dd2"),
                new EmpList(4000, "dd3"),
                new EmpList(3000, "dd4"),
                new EmpList(18000, "dd5")
        );

        ExecutorService executorService = Executors.newSingleThreadExecutor(); // Single Thread
        ExecutorService executorServicePoolFixed = Executors.newFixedThreadPool(2); // Multiple thread => Thread pool

//       Task 1
        Runnable task1 = () -> { //
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task 1");
//            aList.stream().forEach((x)->System.out.println(x));
            aList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);//Even Number

        };

//        Task 2
        Runnable task2 = () -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Task 2");
            List<String> aFruitsList = Arrays.asList("Mango", "Apple", "Orange");
//            aFruitsList.forEach((x)-> System.out.println(x));
            aFruitsList.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
        };

//        Task 3
        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName());

            System.out.println("Task 3");
            Predicate<EmpList> eList1 = e -> e.getSalary() < 5000;
            for (EmpList e : eList) {
                if (eList1.test(e)) {
                    System.out.println(e.getSalary());
                }
            }

//            Using Stream Api
          eList.stream().filter(x -> x.getSalary() < 10000).collect(Collectors.toList()).forEach((System.out::println));
//            eList.stream().filter(x -> x.getSalary() < 10000).collect(Collectors.toList()).forEach((xx) -> System.out.println(xx));

        };

//        Task 4
        Executor task4 = ((r) -> {
            System.out.println("Executor internally call execute(Runnable r) method ");
            System.out.println(r);
        });

        executorService.submit(task1);
        executorServicePoolFixed.submit(task2);
        executorServicePoolFixed.submit(task3);

        executorService.shutdownNow();
        executorServicePoolFixed.shutdown();
    }
}
