package threading;

public class SynchronizedExpl extends Thread{

    Object obj1 = new Object();
    Object obj2 = new Object();

    @Override
    public void run() {
        f2();
        f1();
    }

    public void f2(){
        synchronized(obj2){
            synchronized(obj1){
                System.out.println("f2");
            }
        }
    }

    public void f1(){
        synchronized(obj2){
            synchronized(obj1){
                System.out.println("f1");
            }
        }
    }

    public static void main(String[] args) {

SynchronizedExpl synchronizedExpl = new SynchronizedExpl();
        synchronizedExpl.start();

    }
}
