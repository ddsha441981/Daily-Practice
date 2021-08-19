package garbage;

public class Eligible3 {

    public void m1(){
        ABC a1 = new ABC();// Eligible to gc when method is completed
        a1.m2();

    }


    public static void main(String[] args) {
        Eligible3 e1 =new Eligible3(); //Egar Object creation
        e1.m1();
    }
}
class ABC{
    public void m2(){
        System.out.println("Next Class");
    }

}
