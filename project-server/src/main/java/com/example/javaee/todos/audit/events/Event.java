package com.example.javaee.todos.audit.events;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event_log")
@Inheritance
@DiscriminatorColumn(name="event_type")
public abstract class Event {

    @Id
    @GeneratedValue
    private long id;
    private long timing;
    private String uuid;
    private Date date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTiming() {
        return timing;
    }

    public void setTiming(long metrics) {
        this.timing = metrics;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
