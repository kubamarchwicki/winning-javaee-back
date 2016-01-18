package com.example.javaee.todos.audit.events;

import com.example.javaee.todos.audit.CorrelationId;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("write")
public class WriteEvent extends Event {

    public WriteEvent() {}

    public WriteEvent(CorrelationId id, Date date, long metrics) {
        setData(new EventData(id.getUuid(), date, metrics));
    }

}
