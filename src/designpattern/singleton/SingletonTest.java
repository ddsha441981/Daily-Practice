package designpattern.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        System.out.println("-----------------Before Creating Singleton Class-----------------");
        SingletonTest s1 = new SingletonTest();
        SingletonTest s2 = new SingletonTest();
        System.out.println(s1.toString() + " -------------Differance reference ------------ " + s2.toString());

        System.out.println("-----------------After Creating Singleton Class-----------------");
        SingletonPattern aObj1 = SingletonPattern.getInstance();
        SingletonPattern aObj2 = SingletonPattern.getInstance();

        System.out.println(aObj1.toString() + " ------------- No Differance between reference ------------ " + aObj2.toString());
    }
}

//    SingleTon Class
class SingletonPattern {
    //step 1.
    //Create static object of class
     static SingletonPattern sp = new SingletonPattern();

    //step 2.
     //Private Constructor
     private SingletonPattern(){

     }

    //step 3.
     //Create static method
     public static SingletonPattern getInstance(){
         return  sp;
     }

}
