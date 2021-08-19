package threading.executorServices;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tasks {

    public static void main(String[] args) {

        //1st Way
        MyTasks myTasks = new MyTasks();
        myTasks.start();// Thread Start


        //    Second Way By Using Concurrency / Executor
        ExecutorService executorService =  Executors.newSingleThreadExecutor();

//    By Using Anonymous Class
        Runnable aTask1 = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println("Second way Task 1 is execute by Using Concurrency / Executor and  Anonymous class");
            }
        };

//    3rd Way is Lambda Expression coz runnable is @functional interface
        Runnable aTask2 = ()->{
            System.out.println(Thread.currentThread().getName());
            System.out.println("3rd Way By using runnable interface ");
        };

        executorService.submit(aTask1);
        executorService.submit(aTask2);
//        Now shutdown everytime
        executorService.shutdown();

    }


}
