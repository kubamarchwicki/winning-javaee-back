package com.example.javaee.todos.audit.write;

import com.example.javaee.todos.Todo;
import com.example.javaee.todos.audit.CorrelationId;
import com.example.javaee.todos.audit.LogPersistor;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.Optional;

public class DataModificationLogging {

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

        Object retObj = ctx.proceed();
        Todo todo;
        if (Optional.class.isInstance(retObj)) {
            todo = ((Optional<Todo>) retObj).get();
        } else if (Todo.class.isInstance(retObj)) {
            todo = (Todo) retObj;
        } else {
            throw new IllegalStateException("Todo.class is not returned!");
        }

        persistor.save(new WriteLog(todo.getId(), optional.get().getUuid()));
        return retObj;
    }
}
