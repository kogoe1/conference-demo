package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceController {

//    @Value("${DB_USERNAME}")
//    private String dbUsername;
//
//    @Value("${DB_PASSWORD}")
//    private String dbPassword;
//
//    @Bean
//    public DataSource dataSource() {
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://localhost:5432/conference_app");
//        builder.username(dbUsername);
//        builder.password(dbPassword);
//        System.out.println("My custom Datasource bean has been initialised and set");
//        return builder.build();
//    }
}
