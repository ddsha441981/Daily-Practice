package threading;

import java.util.Random;

public class Producer1 extends Thread {

    public Producer1() {

    }

    public Producer1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            synchronized (HandlingTest.bowl) {
                if (HandlingTest.bowl.size() < 50) {
                    Random random = new Random(); //dish
                    int dish = random.nextInt(20); //create dish
                    HandlingTest.bowl.add(dish);//add dish
                    System.out.println("Dish Added " + Thread.currentThread().getName());
                }
            }
        }
    }
}
