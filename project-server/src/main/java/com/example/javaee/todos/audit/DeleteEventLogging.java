package com.example.javaee.todos.audit;

import javax.ejb.Stateless;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DeleteEventLogging {

    @PersistenceContext
    EntityManager em;

    @AroundInvoke
    public Object invoke(InvocationContext ctx) throws Throwable {
        System.out.println("DeleteEventLogging = " + ctx.getTarget());
        return ctx.proceed();
    }
}
