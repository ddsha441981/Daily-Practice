package polymorphisms;

public class PersonTest extends Person{

    @Override
    public void customer() {
        System.out.println("I am Customer");
    }

    @Override
    public void husband(){
        System.out.println("I am Good Husband");
    }

    @Override
    public void std(){
        System.out.println("I am Good Student");
    }

    @Override
    public void comapnyName(){
        System.out.println("I am Employee of starsun technoloy pvt ltd Pune");
    }

    public static void main(String[] args){
//        Late binding / dynamic / Runtime Polymorphism
//        Jvm will take care of this apporch not compiler

        PersonTest personTest = new PersonTest();
        personTest.comapnyName();
        personTest.customer();
        personTest.husband();
        personTest.std();
    }
}
