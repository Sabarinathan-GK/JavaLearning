package learn.oopspackage.encapsulation;

public class Address {
    private int houseNumber;
    private String streetName;
    private String areaName;
    private String city;
    private int zip;

    public Address(int houseNumber, String streetName, String areaName, String city, int zip) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.areaName = areaName;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                ", areaName='" + areaName + '\'' +
                ", city='" + city + '\'' +
                ", zip=" + zip +
                '}';
    }
}

