package learn.oopspackage.encapsulation;

public class Customer {
    private String name;
    private Address homeAddress;
    private Address officeAddress;

    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeAddress=" + homeAddress +
                ", officeAddress=" + officeAddress +
                '}';
    }
}
