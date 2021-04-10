package com.example.question_6.Controller;

import com.example.question_6.Model.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
@PropertySource("classpath:/application.properties")
public class DatabaseConfiguration {

        @Autowired
        Environment databaseProperties;

        Database database = new Database();

        public Database getDbConfig(){
            database.setDbHost(databaseProperties.getProperty("db.host.url"));
            database.setDbPort(databaseProperties.getProperty("db.port.number"));
            database.setDbService(databaseProperties.getProperty("db.service.name"));
            database.setDbUser(databaseProperties.getProperty("db.user"));
            database.setDbPassword(databaseProperties.getProperty("db.password"));
            return database;
        }

        public String databaseDetails()
        {
            return database.toString();
        }
}
