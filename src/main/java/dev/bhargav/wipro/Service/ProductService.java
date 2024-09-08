package dev.bhargav.wipro.Service;


import dev.bhargav.wipro.Repository.CustomerRepository;
import dev.bhargav.wipro.Repository.ProductRepository;
import dev.bhargav.wipro.models.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;
    private CustomerRepository customerRepository;
    public ProductService(ProductRepository productRepository, CustomerRepository customerRepository) {
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    public Product addProduct(String name , String description, int price) {
        Product product = new Product();
        product.setProduct_name(name);
        product.setProductDescription(description);
        product.setProductPrice(price);
        return productRepository.save(product);
    }

    public Product deleteProduct(int id) {
        return productRepository.deleteById(id);
    }

    public Product updateProduct(int id , String name , String description, int price) {
        Product product = productRepository.findById(id);
        product.setProduct_name(name);
        product.setProductDescription(description);
        product.setProductPrice(price);
        return productRepository.save(product);

    }

    public Product searchProduct(int id) {
        return productRepository.findById(id);
    }

}
