package com.example.javaee.todos.audit;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LogPersistor {

    @PersistenceContext
    EntityManager em;

    @Asynchronous
    public void save(Object o) {
        em.persist(o);
    }

}
