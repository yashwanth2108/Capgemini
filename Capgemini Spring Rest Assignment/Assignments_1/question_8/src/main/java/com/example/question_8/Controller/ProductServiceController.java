package com.example.question_8.Controller;

import com.example.question_8.Model.Product;
import com.example.question_8.Service.ProductService;
import com.example.question_8.Service.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductServiceController {

    ProductService productServiceImpl = new ProductServiceImpl();

    @PostMapping(path = "/addProduct")
    public String AddProduct(@RequestBody Product product)
    {
        return productServiceImpl.AddProduct(product);
    }
    @PostMapping(path = "/addProduct")
    public Product updateProduct(@RequestBody Product product)
    {
        return productServiceImpl.updateProduct(product);
    }
    @PostMapping(path = "/addProduct/{productId}")
    public Optional<Product> displayProduct(@PathVariable Integer productId)
    {
        return productServiceImpl.displayProduct(productId);
    }
    @PostMapping(path = "/addProduct")
    public List<Product> displayAllProduct()
    {
        return productServiceImpl.displayAllProduct();

    }
    @PostMapping(path = "/addProduct")
    public String deleteProduct(Integer productId)
    {
        return productServiceImpl.deleteProduct(productId);
    }

}
