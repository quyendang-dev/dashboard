package biz.aceras.dashboard.controllers;

import biz.aceras.dashboard.domain.Product;
import biz.aceras.dashboard.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @DeleteMapping("/products/{id}")
    void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

    @PostMapping("/products")
    void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }

    @PutMapping("/products")
    void updateProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
}