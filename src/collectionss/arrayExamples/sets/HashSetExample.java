package collectionss.arrayExamples.sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

//    Set
//    1. Duplicates are not allowed
//    2. Insertion order not preserved
//    3. There are no sepcial methods inside set
//    4. Under Laying data structure is Hashtable
//    5. objects inserts based on hash-code
//    6. null allowed
//    7. Used for Serach operation (Best Choice)
//    8. Defult capacity is 16 and fill ratio is 0.75

    public static void main(String[] args) {

        HashSet aHashSet = new HashSet();
        aHashSet.add("B");
        aHashSet.add("Z");
        aHashSet.add("10");
        aHashSet.add("5");
        aHashSet.add("A");
        aHashSet.add("null");
        System.out.println(aHashSet);
        //when dublicate value insert return false
        System.out.println(aHashSet.add("A"));// false


    }
}
