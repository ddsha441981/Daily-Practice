package interface_practice;

interface ClientInterface {

    String  logoName = "Software pvt ltd ";//by default public static final
    public void input1();
    public void output1();

    default void changeLogo(){
        System.out.println("I'm changing logo by using default method");
    }

}
