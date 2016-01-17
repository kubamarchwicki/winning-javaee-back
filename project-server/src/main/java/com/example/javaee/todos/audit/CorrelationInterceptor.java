package com.example.javaee.todos.audit;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.Optional;

@Stateless
public class CorrelationInterceptor {

    @Resource
    SessionContext sessionContext;

    @AroundInvoke
    public Object invoke(InvocationContext ctx) throws Throwable {
        Optional<CorrelationId> correlationId = CorrelationId.getCorrelationIdFromContext(sessionContext);
        if (!correlationId.isPresent()) {
            correlationId = Optional.of(CorrelationId.createInContext(sessionContext));
        }

        System.out.println("CorrelationId = " + correlationId.get());
        return ctx.proceed();
    }

}
