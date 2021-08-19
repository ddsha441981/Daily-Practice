package collectionss.arrayExamples.lists;

import java.util.ArrayList;

public class ArrayListExample {

    // Dublicate are allowed
//    Homogenius and hetrogenius object are allowed
    //null allowed
    //Work with this formala while creating new arrayList =
//    new Capacity = current Capacity * 3/2+1
    //    4. Internally  implementing RandomAccess interface

    public static void main(String[] args){
        ArrayList aList = new ArrayList();
        aList.add("AAA");
        aList.add("AAA");
        aList.add("BBB");
        aList.add("ZZZ");
        aList.add(null);
        System.out.println(aList);
        aList.add(null);
        aList.remove("BBB");
        System.out.println(aList);
        aList.forEach((element)->{
            System.out.println(element);
        });
//        aList.clear();

//        Copy data from one Array to Another
        ArrayList nList =  new ArrayList(aList);
        System.out.println(" New ArrayList is: - ");
        nList.forEach((elements)->{
            System.out.println(elements);
        });

    }
}
