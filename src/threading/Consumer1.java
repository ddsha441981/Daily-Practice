package threading;

import java.util.Random;

public class Consumer1 extends Thread {

    public Consumer1() {

    }

    public Consumer1(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
//            Synchronized
            synchronized (HandlingTest.bowl) { //Monitor / Resource
                if (!HandlingTest.bowl.isEmpty()) { //bowl empty
                    int dish = HandlingTest.bowl.get(0); //taking dish
                    HandlingTest.bowl.remove(0);//remove dish
                    System.out.println("Dish Removed " + Thread.currentThread().getName());
                }
            }

        }
    }
}
