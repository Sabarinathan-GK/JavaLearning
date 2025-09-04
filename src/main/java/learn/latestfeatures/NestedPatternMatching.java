package learn.latestfeatures;

public class NestedPatternMatching {
    record Customer(String customerName, String email){}
    record Product(String productName, double Rate){}
    record Order(Customer customer, Product product){}

    /*private static void processOrder(Object obj){
        if(obj instanceof Order(
                Customer(String customerName, String email),
                Product(String productName, double price)
        )){
            System.out.println(customerName+"  "+email+"  "+productName+"  "+price);
        }
    }*/

    public static void main(String[] args) {
        //processOrder(new Order(new Customer("Sabari","abc@gmail.com"),new Product("FaceWash",450)));
    }
}
