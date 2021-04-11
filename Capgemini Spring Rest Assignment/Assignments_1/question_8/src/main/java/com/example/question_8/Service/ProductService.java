package com.example.question_8.Service;

import com.example.question_8.Model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public String AddProduct(Product product);

    public Product updateProduct(Product product);

    public Optional<Product> displayProduct(Integer productId);

    public List<Product> displayAllProduct();

    public String deleteProduct(Integer productId);
}
