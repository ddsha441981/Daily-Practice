package garbage;

public class RuntimeTest {
    public static void main(String[] args){
       Runtime r =  Runtime.getRuntime();//SingleTon Class

        System.out.println("Total Memory.........." +  r.totalMemory());
        System.out.println("Free Memory........." + r.freeMemory());
        System.out.println("Available Processors........" + r.availableProcessors());

        for (int i = 0; i <= 1000000000; i++){
            new RuntimeTest(); //Create 1000000000 object
        }
        System.out.println("Free memory after 1000000000 objects....."+r.freeMemory());
        r.gc();
        System.out.println("Free Memory After calling GC...... " + r.totalMemory());
    }
}
