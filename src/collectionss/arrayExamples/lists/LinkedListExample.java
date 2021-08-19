package collectionss.arrayExamples.lists;

import java.util.*;

public class LinkedListExample {

//    1. dublicates are allowed
//    2. best choice for data  deleting and updating because there are shifting
//    3. Work with nodes
//    4. Internally not implementing RandomAccess interface
    public static void main(String[] args){
        LinkedList alinkedList = new LinkedList();

        alinkedList.add("Abc");
        alinkedList.add("BBB");
        alinkedList.add("DDD");
        alinkedList.add("YYY");
        alinkedList.add("ZZZ");
        alinkedList.add("PPP");
        alinkedList.set(0 , "555"); // set use to replace
        System.out.println(alinkedList.getFirst());
        System.out.println(alinkedList.getLast());
        System.out.println(alinkedList.removeFirst());
        System.out.println(alinkedList);

        alinkedList.forEach((element)->{
         System.out.println(alinkedList);
        });
    }
}
