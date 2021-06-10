package com.learnjava.redis.resource;

import com.learnjava.redis.entity.Product;
import com.learnjava.redis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id) {
        return productService.findProduct(id);
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
        return productService.remove(id);
    }

}
