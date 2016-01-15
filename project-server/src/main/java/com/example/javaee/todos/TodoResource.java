package com.example.javaee.todos;


import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @Inject
    private Store store;

    @GET
    public List<Todo> getAll() {
        return store.getAll();
    }

    @POST
    public Todo create(@Valid Todo todo) {
        return store.create(todo);
    }

    @PUT
    @Path("/{id}")
    public Optional<Todo> update(@PathParam("id") long id, @Valid Todo todo){
        return store.save(id, todo);
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") long id){
        if (store.remove(id)) {
            return Response.noContent().build();
        }

        return Response.status(Response.Status.NOT_FOUND).build();
    }

}