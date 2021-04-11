package com.example.question_7.Configuration;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@ComponentScan({"com.example.question_7"})
@EnableMongoRepositories({"com.example.question_7.Repository"})
@PropertySource("classpath:/application.properties")
public class ApplicationConfiguration {


    @Autowired
    private Environment env;

    @Bean
    public MongoDatabaseFactory mongoDbFactory() {

        MongoClientURI uri = new MongoClientURI(env.getProperty("spring.data.mongodb.uri"));
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase(env.getProperty("spring.data.mongodb.database"));
        return new SimpleMongoClientDatabaseFactory(String.valueOf(mongoClient));
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

        return mongoTemplate;

    }
}
