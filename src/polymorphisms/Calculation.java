package polymorphisms;

class Calculation {
    public void calculate(int a){
        System.out.println("Method 1");
    }

    public void calculate(int a,int b){
        System.out.println("Method 2");
    }

    public void calculate(String empName , double salary){
        System.out.println("Method 3");
    }

    public void calculate(int a, int b, int c){
        System.out.println("Method 4");
    }

    public void calculate(int a ,double b){
        System.out.println("Method 5");
    }
}
