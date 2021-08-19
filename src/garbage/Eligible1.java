package garbage;

public class Eligible1 {
    public static void main(String[] args) {
        Eligible1 e1 = new Eligible1();
        Eligible1 e2 = new Eligible1();
        System.out.println(e1);
        System.out.println(e2);

        e1 = null;
        e2 = null;

        System.out.println(e1);
        System.out.println(e2);
    }
}
