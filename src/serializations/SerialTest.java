package serializations;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car implements Serializable {
    int j = 10;
    int p = 20;
}

public class SerialTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("<------------------------------Serialization Started------------------------------>");
        Car car = new Car();
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(car);

        System.out.println("<------------------------------Serialization ended------------------------------>");


        System.out.println("<------------------------------DeSerialization Started------------------------------>");
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car car2 = new Car();
        car2 = (Car) ois.readObject();

        System.out.println("<------------------------------DeSerialization ended------------------------------>");
        System.out.println(car.j + "-------------------------------------------------------" + car2.p);

    }
}
