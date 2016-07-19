package com.alepoletto.netflix.zuul.test.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */
@Path("/echo")
public interface EchoResource {

    @GET
    @Path("{word}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response echo(@PathParam("word") String word);


}
