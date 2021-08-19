package streamss;

public class Bike {

    int bikeId;
    String bikeName;
    String companyName;
    int price;

    public Bike(int bikeId, String bikeName, String companyName, int price) {
        this.bikeId = bikeId;
        this.bikeName = bikeName;
        this.companyName = companyName;
        this.price = price;
    }

    public int getBikeId() {
        return bikeId;
    }

    public String getBikeName() {
        return bikeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", bikeName='" + bikeName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", price=" + price +
                '}';
    }
}
