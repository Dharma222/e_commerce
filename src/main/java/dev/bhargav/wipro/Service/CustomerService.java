package dev.bhargav.wipro.Service;


import dev.bhargav.wipro.Repository.CustomerRepository;
import dev.bhargav.wipro.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(String name, String email, String billing, String Shipping) {
        Customer c = new Customer();
        c.setCustomername(name);
        c.setCustomermail(email);
        c.setCustomerbillingaddress(billing);
        c.setCustomershippngaddress(Shipping);
        Customer c1 =customerRepository.save(c);
        return c1;
    }

    public  Customer deleteCustomer(int id) {
        return customerRepository.deleteById(id);
    }

    public Customer getCustomer(int id) {
        return customerRepository.findById(id);
    }

    public Customer updateCustomer(int id, String name, String email, String billing, String Shipping) {
        Customer c = new Customer();
        c.setId(id);
        c.setCustomername(name);
        c.setCustomermail(email);
        c.setCustomerbillingaddress(billing);
        c.setCustomershippngaddress(Shipping);
        Customer c1 =customerRepository.save(c);
        return c1;
    }



}
