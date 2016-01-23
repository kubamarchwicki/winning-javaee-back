package com.example.javaee.reports;

import org.skife.jdbi.v2.DBI;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

@ApplicationScoped
public class JDBIConfiguration {

    @Resource(lookup = "java:jboss/datasources/ExampleMySQLDS")
    DataSource dataSource;

    @Produces
    public EventsPerMinuteDao createEventPerMinuteDao() {
        DBI dbi = new DBI(dataSource);
        return dbi.onDemand(EventsPerMinuteDao.class);
    }

    public void dispose(@Disposes EventsPerMinuteDao dao) {
        dao.close();
    }
}
