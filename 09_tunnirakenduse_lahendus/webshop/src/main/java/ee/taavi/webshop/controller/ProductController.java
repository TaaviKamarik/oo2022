package ee.taavi.webshop.controller;

import ee.taavi.webshop.model.Product;
import ee.taavi.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("products/{index}")
    public Product getProduct(@PathVariable Long index){
        return productRepository.findById(index).get();
    }

    @DeleteMapping("products/{index}")
    public void deleteProduct(@PathVariable Long index){
        productRepository.deleteById(index);
    }

    @DeleteMapping("products")
    public String deleteAllProducts(){
        productRepository.deleteAll();
        return  "Kõik on kustutatud";
    }

    @PostMapping("products")
    public void AddProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @PutMapping("products/{index}")
    public void editProduct(@RequestBody Product product){
        productRepository.save(product);
    }
}
