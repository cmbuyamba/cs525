package org.cmbk.miu.cs525.lectures.lesson8.proxy;

public class Application {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        Customer customer = service.getCustomer("1");
        System.out.println(customer);
        service.getCustomer("1");
    }
}
