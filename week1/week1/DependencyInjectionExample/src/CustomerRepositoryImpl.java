// CustomerRepositoryImpl.java
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        // Simulating database lookup
        if (id == 1) return "Alice";
        if (id == 2) return "Bob";
        return "Customer not found";
    }
}