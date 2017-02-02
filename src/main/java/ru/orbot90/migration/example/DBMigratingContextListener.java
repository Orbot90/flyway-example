package ru.orbot90.migration.example;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by Iurii_Plevako on 2/2/2017.
 */
@Component
public class DBMigratingContextListener {

    private final Flyway flyway;

    @Autowired
    public DBMigratingContextListener(Flyway flyway) {
        this.flyway = flyway;
    }

    @EventListener(ContextRefreshedEvent.class)
    public void migrateDatabase() {
        flyway.migrate();
    }
}
