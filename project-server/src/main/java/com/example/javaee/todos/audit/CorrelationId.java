package com.example.javaee.todos.audit;

import javax.ejb.SessionContext;
import java.util.Optional;
import java.util.UUID;

public class CorrelationId {
    private final static String KEY = "correlationId";
    private final String uuid;

    public CorrelationId() {
        this.uuid = UUID.randomUUID().toString();
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid;
    }

    public static CorrelationId createInContext(SessionContext ctx) {
        CorrelationId id = new CorrelationId();
        ctx.getContextData().put(CorrelationId.KEY, id);
        return id;
    }

    public static Optional<CorrelationId> getCorrelationIdFromContext(SessionContext ctx) {
        return Optional.ofNullable((CorrelationId) ctx.getContextData().get(CorrelationId.KEY));
    }
}
