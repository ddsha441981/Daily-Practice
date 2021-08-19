package threading.executorServices;

public class OldWayImplRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("By using Runnable interface");
    }
}
