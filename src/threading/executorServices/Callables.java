package threading.executorServices;

import java.util.concurrent.*;

public class Callables {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable aTask = () -> "My First Task";
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable aTask3 = new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("Task 3 execute");

                return null;
            }
        };

//        Task 1
        Future<String> aFutureTask1 = executorService.submit(aTask);
        System.out.println(aFutureTask1.get());

//        Task 2
        SumNumbers aTask2 = new SumNumbers(20);
        Future aFutureTask2 = executorService.submit(aTask2);
        Object obj = aFutureTask2.get();
        System.out.println("Sum is " + obj);

//        Task 3
        Future aFutureTask3 = executorService.submit(aTask3);
        Object itemList = aFutureTask3.get();
        System.out.println(itemList);

        executorService.shutdown();


    }
}
