package collectionss.arrayExamples.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationsExample {

    //    We we want to get object one by one from collection then we should go for cursors
//    1. Enumeration
//    2. Iterator
//    3. List Iterator
//    1. Enumeration used to only legacy classes for vector ==> hasMoreElement() nextElement()
//    2. It's not universal cursor
    public static void main(String[] args) {
        Vector aVector = new Vector();
        for (int i = 0; i <= 10; i++) {
            aVector.addElement(i);
        }
        System.out.println(aVector);

//        Now getting objects one by one using Enumeration Cursor
        Enumeration e = aVector.elements();
        while(e.hasMoreElements()){
            Integer i = (Integer)  e.nextElement();
            if(i % 2 == 0 ){
                System.out.println(i);
            }
            System.out.println(aVector);
        }

    }
}
