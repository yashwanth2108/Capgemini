package com.example.question_8.Service;

import com.example.question_8.Model.Product;
import com.example.question_8.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository ProductRepository;

    @Override
    public String AddProduct(Product product)
    {
        ProductRepository.insert(product);
        return "Product Deleted Successfully";
    }
    @Override
    public Product updateProduct(Product product)
    {
        return ProductRepository.save(product);
    }

    @Override
    public Optional<Product> displayProduct(Integer productId)
    {
        return ProductRepository.findById(productId);
    }

    @Override
    public List<Product> displayAllProduct()
    {
        return ProductRepository.findAll();

    }

    @Override
    public String deleteProduct(Integer productId)
    {
        ProductRepository.deleteById(productId);
        return "Product Deleted Successfully";
    }

}
