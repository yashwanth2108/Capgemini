package com.example.question_8.Controller;

import com.example.question_8.Model.Product;
import com.example.question_8.Service.ProductService;
import com.example.question_8.Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductServiceController {

    @Autowired
    ProductService productServiceImpl;

    @PostMapping(path = "/addProduct")
    public String AddProduct(@RequestBody Product product)
    {
        return productServiceImpl.AddProduct(product);
    }
    @PostMapping(path = "/addProducts")
    public Product updateProduct(@RequestBody Product product)
    {
        return productServiceImpl.updateProduct(product);
    }
    @PostMapping(path = "/displayProduct/{productId}")
    public Optional<Product> displayProduct(@PathVariable Integer productId)
    {
        return productServiceImpl.displayProduct(productId);
    }
    @GetMapping(path = "/displayAllProduct")
    public List<Product> displayAllProduct()
    {
        return productServiceImpl.displayAllProduct();

    }
    @PostMapping(path = "/deleteProduct/{productId}")
    public String deleteProduct(@PathVariable Integer productId)
    {
        return productServiceImpl.deleteProduct(productId);
    }

}
