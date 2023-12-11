package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

//@Configuration
//public class DatabaseConfiguration {
    /*
    @Primary
    @Bean(name="PostgresDataSource")
    public DataSource PostgresDataSource () {
        //return DataSourceBuilder.create().type(HikariDataSource.class).build();
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://192.168.1.31:5432/test_db_1")
                .username("postgres")
                .password("postgres")
                .build();
    }

    @Bean(name="MySQLDataSource")
    public DataSource MySQLDataSource() {

        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://192.168.1.31:5432/test_db_1")
                .username("postgres")
                .password("postgres")
                .build();
        //return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
    */

//}
