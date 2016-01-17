package com.example.javaee.todos.stores;

import com.example.javaee.todos.Store;
import com.example.javaee.todos.Todo;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Default
@Stateless
public class DatabaseStore implements Store {

    @PersistenceContext
    EntityManager em;

    @Override
    public Todo create(Todo data) {
        em.persist(data);
        em.flush();
        em.refresh(data);
        return data;
    }

    @Override
    public Optional<Todo> get(long id) {
        return Optional.ofNullable(em.find(Todo.class, id));
    }

    @Override
    public List<Todo> getAll() {
        return em.createNamedQuery(Todo.FIND_ALL).getResultList();
    }

    @Override
    public Optional<Todo> save(long id, Todo data) {
        Optional<Todo> todoOptional = get(id);
        if (todoOptional.isPresent()) {
            Todo t = em.merge(data);
            return Optional.of(t);
        }

        return Optional.empty();
    }

    @Override
    public boolean remove(long id) {
        Optional<Todo> todoOptional = get(id);
        if (todoOptional.isPresent()) {
            em.remove(todoOptional.get());
            return true;
        }

        return false;
    }
}
