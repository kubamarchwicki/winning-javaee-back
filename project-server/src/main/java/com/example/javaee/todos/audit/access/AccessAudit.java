package com.example.javaee.todos.audit.access;

import com.example.javaee.todos.audit.LogPersistor;
import com.example.javaee.todos.audit.CorrelationId;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.security.Principal;
import java.util.Date;
import java.util.Optional;

@Stateless
public class AccessAudit {

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

        Principal principal = this.sessionContext.getCallerPrincipal();
        persistor.save(new AccessLog(optional.get(), principal, new Date()));

        System.out.println("AccessAudit (" + optional.get() + ") = " + principal.getName());
        return ctx.proceed();
    }
}
