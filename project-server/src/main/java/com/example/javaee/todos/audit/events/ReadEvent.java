package com.example.javaee.todos.audit.events;

import com.example.javaee.todos.audit.CorrelationId;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("read")
public class ReadEvent extends Event {

    public ReadEvent() {}

    public ReadEvent(CorrelationId id, Date date, long time) {
        setData(new EventData(id.getUuid(), date, time));
    }
}
