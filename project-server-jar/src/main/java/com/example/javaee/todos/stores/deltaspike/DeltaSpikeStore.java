package com.example.javaee.todos.stores.deltaspike;

import com.example.javaee.todos.Store;
import com.example.javaee.todos.Todo;
import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.inject.Alternative;
import java.util.List;
import java.util.Optional;

@Alternative
@Transactional
public abstract class DeltaSpikeStore
        extends AbstractEntityRepository<Todo, Long>
        implements Store {

    public abstract Todo findOptionalById(long id);

    @Override
    public Todo create(Todo data) {
        return this.saveAndFlushAndRefresh(data);
    }

    @Override
    public Optional<Todo> get(long id) {
        return Optional.ofNullable(this.findOptionalById(id));
    }

    @Override
    public List<Todo> getAll() {
        return this.findAll();
    }

    @Override
    public Optional<Todo> save(long id, Todo data) {
        return Optional.ofNullable(this.saveAndFlushAndRefresh(data));
    }

    @Override
    public boolean remove(long id) {
        Optional<Todo> todoOptional = this.get(id);

        if (todoOptional.isPresent()) {
            this.attachAndRemove(todoOptional.get());
            return true;
        } else {
            return false;
        }
    }
}
