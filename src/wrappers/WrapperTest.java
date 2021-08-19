package wrappers;

//    Java is oops based programming language and it's based on object.
//    But java also support 8 primitive data types. Where as it is not an object
//    In java collection framework does't support homogenous(Primitive) data tpye. So overcome this problem...
//    We Use Wrapper Classes
//    Wrapper classes wrap the primitive data type into object of the class
//    (Integer, Byte,  Float, Character ,Double ,Long etc ) -> Wrapper Object
//    (int, float, double, byte, char, double, long etc...) Primitive Data
//    To convert Primitive to Wrapper => valueOf() method ParseInt
 /*
 in java it is possible to create wrapper object in two ways.
         a) By using constructor approach
         b) By using valueOf() method
  */

import static java.lang.Integer.valueOf;

public class WrapperTest {

    public static void main(String[] args) {

        //constructor approach to create wrapper objec

        Integer l1 = new Integer(50);
        Integer l2 = new Integer("50"); //String "50" convert into Integer
        System.out.println(l1 + l2);

//        Integer a1 = new Integer(50);
//        Integer a2 = new Integer("Ten"); //NumberFormatException because ten is not number
//        System.out.println(a1+a2);

        //valueOf() method to create Wrapper object
        Integer c1 = valueOf(5);
        Integer c2 = valueOf("5");
        System.out.println(c1+c2);//10

//        Integer p1 = valueOf(5);
//        Integer p2 = valueOf("Five");
//        System.out.println(p1+p2);////NumberFormatException because five is not number


        // conversion of wrapper to primitive
        Integer x = Integer.valueOf(10);
        int a = x.intValue();
        System.out.println(a);

//Autoboxing : automatic conversion of primitive to wrapper
        Integer i = 100;
        System.out.println(i);

//auto unboxing : automatic conversion of wrapper to primitive
        int x1 = new Integer(100);
        System.out.println(x1);



    }

}
