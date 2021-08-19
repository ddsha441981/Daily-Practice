package collectionss.arrayExamples.lists;

import java.util.Vector;

public class VectorExample {

//    Vector
//    1. Dublicate are allowed
//    2. null allowed
//    3. insertion order is preserved
//    4. Internally Random Access Interface implements
//    5. And it is thread safe but not arraylist is thread safe
//    6. Default capacity of an vector is 10

    public static void main(String[] args){
        Vector aVector = new Vector();
        aVector.add("4555");
        aVector.add("78");
        aVector.add("55");
        aVector.add("781");
        aVector.add("45");

        System.out.println(aVector.firstElement());
        System.out.println(aVector.lastElement());

//        For indexing
        System.out.println(aVector.elementAt(2));

        System.out.println(aVector.capacity());
        System.out.println(aVector.size());
        System.out.println(aVector);


        aVector.forEach((elements)->{

            System.out.println(elements);
        });
    }
}
