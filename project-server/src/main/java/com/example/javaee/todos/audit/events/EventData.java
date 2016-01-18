package com.example.javaee.todos.audit.events;

import javax.persistence.Embeddable;
import java.util.Date;

@Embeddable
public class EventData {
    private long timing;
    private String uuid;
    private Date date;

    public EventData() {
    }

    public EventData(String uuid, Date date, long timing) {
        this.timing = timing;
        this.uuid = uuid;
        this.date = date;
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
