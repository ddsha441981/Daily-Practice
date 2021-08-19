package collectionss.arrayExamples.sets;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
//    LinkedHashSet
//    1. LinkedHashSet is combination of LinkedList and HashTable
//    2. Main Differance is order is preserved inside LinkedHashSet but not in HashSet
//    3. LinkedHashSet mostly used to making cache based memory, RAM Memory, Second ROM

    public static void main(String[] args) {

        LinkedHashSet  aLinkedHashSet = new LinkedHashSet();
        aLinkedHashSet.add("Y");
        aLinkedHashSet.add("P");
        aLinkedHashSet.add("A");
        aLinkedHashSet.add("D");
        aLinkedHashSet.add("null");
        System.out.println(aLinkedHashSet);
    }
}
