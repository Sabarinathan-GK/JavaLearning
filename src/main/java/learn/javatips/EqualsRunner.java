package learn.javatips;

class Customer{
    private int id;

    public Customer(int id){
        super();
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Customer customer = (Customer) object;

        return id == customer.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
public class EqualsRunner {
    public static void main(String[] args) {
        Customer c1 = new Customer(1);
        Customer c2 = new Customer(1);
        System.out.println(c1.equals(c2));
        Customer c3  = new Customer(3);
        System.out.println(c1.equals(c3));
    }
}
