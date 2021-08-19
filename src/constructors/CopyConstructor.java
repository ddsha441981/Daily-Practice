package constructors;

public class CopyConstructor {

    int a = 20;
    int b = 10;

    public CopyConstructor(){
        this.a = a ;
        this.b = b ;
    }

    public CopyConstructor(Object ref){
        ref = ref;
    }
    public static void main(String[] args){
        CopyConstructor copyConstructor  = new CopyConstructor();
        CopyConstructor copyConst  = new CopyConstructor(copyConstructor);
        System.out.println(copyConst.a);
        System.out.println(copyConst.b);


    }
}
