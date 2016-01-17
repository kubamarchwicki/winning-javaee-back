package com.example.javaee.todos;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todos")
@NamedQueries({
        @NamedQuery(name = Todo.FIND_ALL, query = "select t from Todo t")
})
public class Todo {

    final public static String FIND_ALL = "Todo.findAll";

    @Id @GeneratedValue
    @Column(name = "todo_id")
    private long id;

    @NotNull @Size(min = 1)
    @Column(name = "todo_title")
    private String title;

    @Column(name = "todo_order")
    private long order;

    @Column(name = "todo_completed")
    private boolean completed;

    public Todo() {}

    private Todo(long id, String title, long order, boolean completed) {
        this.id = id;
        this.title = title;
        this.order = order;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public long getOrder() {
        return order;
    }

    public boolean isCompleted() {
        return completed;
    }

    public static TodoBuilder aTodo() {
        return new TodoBuilder();
    }

    public static class TodoBuilder {
        private long id;
        private String title;
        private long order;
        private boolean completed;

        private TodoBuilder() {

        }

        public TodoBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public TodoBuilder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TodoBuilder withOrder(long order) {
            this.order = order;
            return this;
        }

        public TodoBuilder isCompleted(boolean completed) {
            this.completed = completed;
            return this;
        }

        public Todo build() {
            return new Todo(id, title, order, completed);
        }
    }
}