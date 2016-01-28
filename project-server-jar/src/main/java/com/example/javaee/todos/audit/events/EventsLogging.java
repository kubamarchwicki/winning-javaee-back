package com.example.javaee.todos.audit.events;

import com.example.javaee.todos.audit.CorrelationId;
import com.example.javaee.todos.audit.LogPersistor;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Optional;

@Stateless
public class EventsLogging {

    @Inject
    LogPersistor persistor;

    @Resource
    SessionContext sessionContext;

    @AroundInvoke
    public Object invoke(InvocationContext ctx) throws Throwable {
        Optional<CorrelationId> optional = CorrelationId.getCorrelationIdFromContext(sessionContext);
        if (!optional.isPresent()) {
            throw new IllegalStateException("CorrelationId is not set!");
        }

        long starttime = System.currentTimeMillis();
        Object retObj = ctx.proceed();
        long endtime = System.currentTimeMillis();

        persistor.save(eventLogFactory(ctx.getMethod(), optional.get(), new Date(), (endtime - starttime)));
        return retObj;
    }

    public Event eventLogFactory(Method method, CorrelationId id, Date date, long time) {
        if (method.isAnnotationPresent(GET.class)) {
            return new ReadEvent(id, date, time);
        } else if (method.isAnnotationPresent(DELETE.class)) {
            return new DeleteEvent(id, date, time);
        } else if (method.isAnnotationPresent(PUT.class) || method.isAnnotationPresent(POST.class)) {
            return new WriteEvent(id, date, time);
        }

        throw new IllegalStateException("Unknown operation");
    }

}
