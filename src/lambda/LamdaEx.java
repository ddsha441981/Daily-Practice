package lambda;

//1. Lambda Expression work with functional interface only.
//2. Functional Interface introduce in java 1.5 but @Functional annotation is introduce in java 1.8
//3. Which interface contains only one abstract method (not default or static method) that's call functional interface
//   like Runnable => run(), Callable => call()-->Return something
// From Java 1.8
//, Consumer => accept(),
// Predicate,
// Function,
// Supplier

//4. In interface we can use static or default method from java 1.8 because we can't overridden static method inside oop's
//5. Another default method is required sometime we need some changes inside interface and there n number of
// classes are implements a particular method so it is not possible to changes every classes so that we use default method.
// It's provide the main features that no force to implements their implementing classes


interface A{

    void show();
    default void getInfo(){
        System.out.println("Method Information : - This is default method and we can use with lambda ");
    }
    static void greeting(){
        System.out.println("Hello Static ");
    }
}

interface B{

    void display(int a , int b);
}

class XYZ implements A{

    @Override
    public void show() {
        System.out.println("Hello First Way By using oops concepts  1st Approach");
    }
}

public class LamdaEx {

    public static void main(String[] args) {

//        Second 2nd Approach By Anonymous class
        A a = new A(){
            @Override
            public void show() {
                System.out.println("Hello Second 2nd Approach By Anonymous class");
            }
        };

        //By Using Lambda
//        Create interface referance
        A obj =  ()-> System.out.println("3rd Approch By using Lambda Expression");

        A obj1 = ()-> System.out.println("Method Information : - This is default method and we can use with lambda ");
        A.greeting();//static method calling

        //Another interface
        B bObj = (int x, int y)-> {
            int sum = x + y;
            System.out.println("sum is " +  sum);
        };


        //Referance 1st Approach
        XYZ xyz = new XYZ();
        xyz.show();

        //2nd  Approach
        a.show();

        //3rd Approch
        obj.show(); // this approach is recommend in 1.8
        obj1.getInfo();

        //Another Interface
        bObj.display(50,98);



    }

}
