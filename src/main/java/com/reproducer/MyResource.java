package com.reproducer;

import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

import io.smallrye.mutiny.Uni;

@Path("/")
@RequestScoped
public class MyResource {

    private static final Logger logger = Logger.getLogger(MyResource.class);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("")
    public Uni<Void> hello() {
        logger.info("Hello");
        return Uni.createFrom().nothing();
    }
}
