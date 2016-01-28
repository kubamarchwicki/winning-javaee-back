package com.example.javaee.todos.audit.write;

import javax.persistence.*;

@Entity
@Table(name = "write_log")
public class WriteLog {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "todo_id")
    private long todoId;

    private String uuid;

    public WriteLog() {

    }

    public WriteLog(long todoId, String uuid) {
        this.todoId = todoId;
        this.uuid = uuid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
