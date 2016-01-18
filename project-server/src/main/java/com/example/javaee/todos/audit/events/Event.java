package com.example.javaee.todos.audit.events;

import javax.persistence.*;

@Entity
@Table(name = "event_log")
@Inheritance
@DiscriminatorColumn(name="event_type")
@Embeddable
public abstract class Event {

    @Id
    @GeneratedValue
    private long id;

    @Embedded
    private EventData data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EventData getData() {
        return data;
    }

    public void setData(EventData data) {
        this.data = data;
    }
}
