package com.example.javaee.todos.audit.events;

import com.example.javaee.todos.audit.CorrelationId;

import javax.persistence.*;
import java.util.Date;

@Entity
@DiscriminatorValue("read")
public class ReadEvent extends Event {

    public ReadEvent() {}

    public ReadEvent(CorrelationId id, Date date, long time) {
        setUuid(id.getUuid());
        setDate(date);
        setTiming(time);
    }
}
