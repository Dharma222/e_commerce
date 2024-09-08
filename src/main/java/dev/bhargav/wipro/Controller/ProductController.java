package dev.bhargav.wipro.Controller;


import dev.bhargav.wipro.Dtos.ProductRequestdto;
import dev.bhargav.wipro.Service.ProductService;
import dev.bhargav.wipro.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/api/products")
    public Product addProduct(@RequestBody ProductRequestdto productRequestdto) {
        return productService.addProduct(
                productRequestdto.getProduct_name(),
                productRequestdto.getProduct_description(),
                productRequestdto.getProduct_price()
        );
    }

    @DeleteMapping("/api/products/{id}")
    public Product deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }

    @PutMapping("/api/products/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody ProductRequestdto productRequestdto)
    {
        return productService.updateProduct(
                id,
                productRequestdto.getProduct_name(),
                productRequestdto.getProduct_description(),
                productRequestdto.getProduct_price()
        );
    }

    @GetMapping("/api/products/{id}")
    public Product getProductById(@PathVariable  int id) {
       return productService.searchProduct(id);
    }



}
