package constructors;

import java.lang.reflect.ParameterizedType;

public class ConstructorsExample {
//    Constructor Type
    /*
    1. Default Constructor
    2. Parameterized Constructor
    3. Private Constructor
    4. Copy Constructor
    */

    int a = 20 ;


    ConstructorsExample(){
        a = a;
    }
    public static void main(String[] args) {

        ConstructorsExample example = new ConstructorsExample();
        System.out.println(example.a);
    }
}
