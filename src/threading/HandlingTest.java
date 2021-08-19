package threading;

import java.util.ArrayList;
import java.util.List;

public class HandlingTest extends Thread{

// public static List<Recipe> bowl = new ArrayList<Recipe>();
   public static List<Integer> bowl = new ArrayList<Integer>();

    public static void main(String[] args){

        Consumer1 consumer1 = new Consumer1("Guest 1");
        Consumer1 consumer2 = new Consumer1("Guest 2");

        Producer1 producer1 = new Producer1("Producer 1");
        Producer1 producer2 = new Producer1("Producer 2");

        consumer1.start();
        consumer2.start();

        producer1.start();
        producer2.start();


    }
}
