package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.postgresql-datasource")
    public DataSource PostgresqlDataSource() { return DataSourceBuilder.create().build(); }

    @Bean
    @ConfigurationProperties(prefix = "spring.mysql-datasource")
    public DataSource MySQLDataSource() {
        return DataSourceBuilder.create().build();
    }
}
