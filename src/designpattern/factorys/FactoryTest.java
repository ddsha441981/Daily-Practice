package designpattern.factorys;

public class FactoryTest {

    public static void main(String[] args) {
//        Laptop aLp1 = new AppleLaptop();
//        aLp1.aLoptopQuality();
//
//        Laptop aLp2 = new DellLaptop();
//        aLp2.aLoptopQuality();
//
//        Laptop aLp3 = new HPLaptop();
//        aLp3.aLoptopQuality();

//        To overcome above problem we can craete factory class

        LaptopFactory aLp = new LaptopFactory();
        Laptop altop = aLp.getNewLaptop("Businesses");
        altop.aLoptopQuality();

    }
}
