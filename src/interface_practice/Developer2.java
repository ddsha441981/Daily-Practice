package interface_practice;

public class Developer2 extends Developer1{

    @Override
    public void developBackend() {

//        Backend Code
        System.out.println("Backend Code is completed...");
    }

    public static void main(String[] args) {
        Developer2 developer = new Developer2();
        developer.designingWebsite();
        developer.developBackend();
    }


}
