package com.example.question_9.Repository;

import com.example.question_9.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerServiceRepository extends CrudRepository<Customer,Integer> {
}
