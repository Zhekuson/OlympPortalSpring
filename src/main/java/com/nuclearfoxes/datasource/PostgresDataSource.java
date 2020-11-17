package com.nuclearfoxes.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class PostgresDataSource {

/*    @Bean
    @ConfigurationProperties("app.datasource")
    public HikariDataSource hikariDataSource(){
        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }*/

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public HikariDataSource hikariSecondDataSource(){
        return DataSourceBuilder
                .create()
                .type(HikariDataSource.class)
                .build();
    }
}
