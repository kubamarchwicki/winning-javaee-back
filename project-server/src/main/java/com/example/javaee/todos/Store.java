package com.example.javaee.todos;


import java.util.List;
import java.util.Optional;

public interface Store {

    Todo create(Todo data);
    Optional<Todo> get(final long id);
    List<Todo> getAll();
    Optional<Todo> save(long id, Todo data);
    boolean remove(long id);
}
