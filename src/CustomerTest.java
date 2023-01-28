package test;

import domain.Customer;

public class CustomerTest {

    public static void main(String[] args) {
        Customer abc = new Customer();
        abc.displayCustomerInfo();
        abc.setTotal(-4.1F);
        abc.setNew(true);
        abc.setID(1);
    }

}
