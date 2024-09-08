package dev.bhargav.wipro.Repository;

import dev.bhargav.wipro.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product save(Product product);

    Product deleteById(int id);

    Product findById(int id);

}
