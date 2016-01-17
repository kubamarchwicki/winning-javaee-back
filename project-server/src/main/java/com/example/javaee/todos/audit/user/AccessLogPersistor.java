package com.example.javaee.todos.audit.user;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AccessLogPersistor {

    @PersistenceContext
    EntityManager em;

    @Asynchronous
    public void save(AccessLog log) {
        em.persist(log);
    }

}
