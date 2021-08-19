package collectionss.arrayExamples.lists;

import java.util.Stack;

public class StackExample {
//    Stack
//    1. Used for LIFO(Last in First Out)
//    2. order is required
//    3. For inserting use push() method
//    4. For removing use pop() method
//    5. peek()
//    6. search()
//    7. If Object is not available inside stack it'll return -1

    public static void main(String[] args){
        Stack aStack = new Stack();
        aStack.push("A");//3
        aStack.push("B");//2
        aStack.push("C");//1
        System.out.println(aStack);

        System.out.println(aStack.pop());//C remove

    }
}
