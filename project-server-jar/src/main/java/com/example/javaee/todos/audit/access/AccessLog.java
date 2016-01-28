package com.example.javaee.todos.audit.access;

import com.example.javaee.todos.audit.CorrelationId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.security.Principal;
import java.util.Date;

@Entity
@Table(name = "access_log")
public class AccessLog {

    @Id @GeneratedValue
    private Long id;
    private String uuid;
    private String username;
    private Date date;

    public AccessLog() {}

    public AccessLog(CorrelationId id, Principal principal, Date date) {
        this.uuid = id.getUuid();
        this.username = principal.getName();
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
