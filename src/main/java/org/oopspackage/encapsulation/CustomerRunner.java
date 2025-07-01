package org.oopspackage.encapsulation;

public class CustomerRunner {
    public static void main(String[] args) {
        Address home = new Address(47, "Bajannai Kovil","Sholinganallur","trichy",6200003);
        Customer customer = new Customer("Sabari",home);
        Address work = new Address(4, "ELcot","Sholinganallur","trichy",6200003);
        customer.setOfficeAddress(work);
        System.out.println(customer);
    }
}

