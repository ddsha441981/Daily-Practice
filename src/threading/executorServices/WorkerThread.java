package threading.executorServices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WorkerThread {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

//    Define Task
//    Task 1
        Runnable aTask1 = () -> {
            String flag = "Task 1";
            System.out.println(Thread.currentThread().getName());

            System.out.println(flag + " Started  " );

            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println(flag +  " completed  " );
        };

//    Task 2
        Runnable aTask2 = () -> {
            String flag = "Task 2";
            System.out.println(Thread.currentThread().getName());
            System.out.println(flag +  " Started  " );

            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println(flag + " completed  " );
        };
//    Task 3
//By Using Anonymous Class

        Runnable aTask3 = new Runnable() {
            String flag = "Task 3";
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(flag +  " Started  " );
                try {
                    TimeUnit.MILLISECONDS.sleep(2000);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }

                System.out.println( flag +  " completed  " );
            }
        };


        executorService.submit(aTask1);//Task 1
        executorService.submit(aTask2);//Task 2
        executorService.submit(aTask3);//Task 3
        executorService.shutdown();
    }

}
