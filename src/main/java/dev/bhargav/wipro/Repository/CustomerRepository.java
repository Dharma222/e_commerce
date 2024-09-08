package dev.bhargav.wipro.Repository;

import dev.bhargav.wipro.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer save(Customer customer);

    Customer deleteById(int id);

    Customer findById(int id);


}
