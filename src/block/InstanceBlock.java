package block;

public class InstanceBlock {

    int a = 25;
    {
//        Instance Block
        System.out.println(a);

    }
    public static void main(String[] args) {
        InstanceBlock block = new InstanceBlock();

    }
}
