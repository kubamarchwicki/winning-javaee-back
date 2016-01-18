package com.example.javaee.todos.audit.events;

import com.example.javaee.todos.audit.CorrelationId;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("delete")
public class DeleteEvent extends Event {

    public DeleteEvent() {}

    public DeleteEvent(CorrelationId id, Date date, long metrics) {
        setData(new EventData(id.getUuid(), date, metrics));
    }

}
