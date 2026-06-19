// CustomerService.java
public class CustomerService {
    private CustomerRepository repository; // depends on interface, not impl!

    // CONSTRUCTOR INJECTION — dependency given from outside
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomer(int id) {
        String name = repository.findCustomerById(id);
        System.out.println("Customer found: " + name);
    }
}