package designpattern.factorys;

public class LaptopFactory {

    public Laptop getNewLaptop(String laptopName) {

        if (laptopName.equals("Student")) {
            return new HPLaptop();
        } else if (laptopName.equals("Developer")) {
            return new DellLaptop();
        } else {
            return new AppleLaptop();
        }
    }
}
