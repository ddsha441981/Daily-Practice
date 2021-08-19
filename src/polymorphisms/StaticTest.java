package polymorphisms;

public class StaticTest extends StaticExample{
//    Static overload method
//    Method Hiding

    public static void m1(){
        System.out.println("Static Method Overloading or Method Hiding");
    }
public static void main(String[] args) {
    StaticExample example = new StaticExample();
    StaticExample.m1();
    StaticTest.m1();
    }
}
