package garbage;

public class Eligible4 {

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Object Destroyed!!");
    }

    public static void main(String[] args){
       new Eligible4();//Lazy object creation
        System.gc();

    }
}
