package collectionss.arrayExamples;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<String> aFruitList = new ArrayList<String>();
        aFruitList.add("AppleLaptop");
        aFruitList.add("Mango");
        aFruitList.add("Banana");
        aFruitList.add("Orange");
        aFruitList.add("Pine-AppleLaptop");
        System.out.println(aFruitList);
        aFruitList.remove("Orange");
        System.out.println(aFruitList);

        //for each
        aFruitList.forEach((element)->{
            System.out.println(element);
        });
        aFruitList.clear();
    }
}
