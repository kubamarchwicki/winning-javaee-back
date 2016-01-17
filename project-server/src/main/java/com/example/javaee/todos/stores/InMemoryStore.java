package com.example.javaee.todos;


import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Singleton
@Startup
public class InMemoryStore implements Store {

    private final AtomicLong idGenerator = new AtomicLong(1);
    private final List<Todo> store = new ArrayList<>();

    public Todo create(Todo data) {
        Todo todo = Todo.aTodo()
                .withId(idGenerator.getAndIncrement())
                .withTitle(data.getTitle())
                .withOrder(data.getOrder())
                .isCompleted(data.isCompleted()).build();
        store.add(todo);
        return todo;
    }

    public Optional<Todo> get(final long id) {
        return store.stream()
                .filter((Todo todo) -> todo.getId() == id)
                .findFirst();
    }

    public List<Todo> getAll() {
        return new ArrayList<>(store);
    }

    public Optional<Todo> save(long id, Todo data) {
        Optional<Todo> maybeTodo = get(id);

        if (maybeTodo.isPresent()) {
            // remove the old todo
            final Todo oldTodo = maybeTodo.get();
            store.remove(maybeTodo.get());

            Todo newTodo = Todo.aTodo()
                    .withId(oldTodo.getId())
                    .withTitle(data.getTitle())
                    .withOrder(data.getOrder())
                    .isCompleted(data.isCompleted()).build();
            store.add(newTodo);
            return Optional.of(newTodo);
        } else {
            return Optional.empty();
        }
    }

    public boolean remove(long id) {
        Optional<Todo> maybeTodo = get(id);

        if (maybeTodo.isPresent()) {
            return store.remove(maybeTodo.get());
        } else {
            return false;
        }
    }
}
