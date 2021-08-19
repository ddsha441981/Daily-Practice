package threading.executorServices;

public class MyTasks extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("My Task is Completing by 1st Way");
    }
}
