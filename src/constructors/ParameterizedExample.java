package constructors;

public class ParameterizedExample {
    int x;
    int y;
    ParameterizedExample(int a , int b){
        a = a;
        b = b;
    }

    public void disp(int x , int y){
        System.out.println(x + " " + y);
    }

    public static void main(String arg []){
        ParameterizedExample example = new ParameterizedExample(20,50);
        example.disp(20,558);

    }
}
