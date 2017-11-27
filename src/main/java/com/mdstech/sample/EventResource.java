package com.mdstech.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Path("/logevents")
public class EventResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventResource.class);

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Event> getEvents() {
        LOGGER.info("Received Request for GetEvents");
        return sampleEvents();
    }

    private List<Event> sampleEvents() {
        LOGGER.debug("Received Request for sampleEvents");
        List<Event> events = new ArrayList<>();
        events.add(new Event("test", "table", LocalDateTime.now()));
        events.add(new Event("test", "panel", LocalDateTime.now()));
        events.add(new Event("test", "menu", LocalDateTime.now()));
        events.add(new Event("test", "button", LocalDateTime.now()));
        LOGGER.debug("Completed request of sampleEvents");
        return events;
    }
}
