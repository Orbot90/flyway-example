package ru.orbot90.migration.example.configuration;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Iurii_Plevako on 2/2/2017.
 */
@Configuration
public class FlywayConfig {

    private final DataSource dataSource;

    @Autowired
    public FlywayConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public Flyway flyway() {
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        return flyway;
    }
}
