package dev.bhargav.wipro.Controller;

import dev.bhargav.wipro.Dtos.CustomerRequestdto;
import dev.bhargav.wipro.Service.CustomerService;
import dev.bhargav.wipro.models.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    private CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/api/addcustomer")
    public Customer addCustomer(@RequestBody CustomerRequestdto customerRequestdto)
    {
       return customerService.addCustomer(customerRequestdto.getCustomername(),
                customerRequestdto.getCustomermail(),
                customerRequestdto.getCustomerbillingaddress(),
                customerRequestdto.getCustomershippngaddress());
    }

    @DeleteMapping("/api/deletecustomer/{id}")
    public Customer deleteCustomer(@PathVariable("id") int customerId)
    {
        return customerService.deleteCustomer(customerId);
    }

    @PutMapping("/api/updatecustomer/{id}")
    public Customer updateCustomer(@PathVariable("id") int customerId,@RequestBody CustomerRequestdto customerRequestdto)
    {
        return customerService.updateCustomer(customerId,
                customerRequestdto.getCustomername(),
        customerRequestdto.getCustomermail(),
        customerRequestdto.getCustomerbillingaddress(),
        customerRequestdto.getCustomershippngaddress());
    }

    @GetMapping("/api/searchcustomer/{id}")
    public  Customer searchcustomer(@PathVariable("id") int customerId)
    {
        return customerService.getCustomer(customerId);
    }



}
