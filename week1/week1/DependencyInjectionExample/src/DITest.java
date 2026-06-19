// DITest.java
public class DITest {
    public static void main(String[] args) {

        // Create the dependency
        CustomerRepository repo = new CustomerRepositoryImpl();

        // INJECT it into the service
        CustomerService service = new CustomerService(repo);

        service.getCustomer(1);  // Customer found: Alice
        service.getCustomer(2);  // Customer found: Bob
        service.getCustomer(5);  // Customer not found
    }
}