package com.example.question_8.Repository;


import com.example.question_8.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,Integer> {

}
