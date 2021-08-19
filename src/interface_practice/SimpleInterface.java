package interface_practice;

public class SimpleInterface implements ClientInterface{
    @Override
    public void input1() {
        System.out.println(logoName);
    }

    @Override
    public void output1() {

    }

    class ChangeLogo implements ClientInterface{


        @Override
        public void input1() {

        }

        @Override
        public void output1() {

        }

        @Override
        public void changeLogo() {
            ClientInterface.super.changeLogo();
        }
    }

    public static void main(String arg[]){
        SimpleInterface aa = new SimpleInterface();
        aa.input1();
        aa.changeLogo();
        ClientInterface aa1 = new SimpleInterface(); // Interface Referance
        System.out.println(ClientInterface.logoName);
    }
}
