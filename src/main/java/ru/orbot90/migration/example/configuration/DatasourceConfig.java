package ru.orbot90.migration.example.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by Iurii_Plevako on 2/2/2017.
 */
@Configuration
public class DatasourceConfig {

    @Value("${jdbc.driverName}")
    private String driverName;
    @Value("${jdbc.databaseurl}")
    private String databaseUrl;
    @Value("${jdbc.databaseusername}")
    private String username;
    @Value("${jdbc.databasepassword}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(databaseUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
