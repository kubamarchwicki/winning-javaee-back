package com.example.javaee.reports;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reports")
@Produces(MediaType.APPLICATION_JSON)
public class ReportingResource {

    @Inject
    EventsPerMinuteDao dao;

    @GET
    @Path("/events")
    public List<EventsPerMinute> events() {
        return dao.listEventsPerMinute();
    }

}
