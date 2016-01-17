package com.example.javaee.todos;


import com.example.javaee.todos.audit.*;
import com.example.javaee.todos.audit.user.AccessAudit;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Stateless
@Interceptors({CorrelationInterceptor.class, AccessAudit.class})
@RolesAllowed("app")
public class TodoResource {

    @Inject
    private Store store;

    @GET
    @Interceptors(ReadEventLogging.class)
    public List<Todo> getAll() {
        return store.getAll();
    }

    @POST
    @Interceptors(WriteEventLogging.class)
    public Todo create(@Valid Todo todo) {
        return store.create(todo);
    }

    @PUT
    @Path("/{id}")
    @Interceptors(WriteEventLogging.class)
    public Optional<Todo> update(@PathParam("id") long id, @Valid Todo todo){
        return store.save(id, todo);
    }

    @DELETE
    @Path("/{id}")
    @Interceptors(DeleteEventLogging.class)
    public Response delete(@PathParam("id") long id){
        if (store.remove(id)) {
            return Response.noContent().build();
        }

        return Response.status(Response.Status.NOT_FOUND).build();
    }

}