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
@Path("/test")
public interface TestResource {

    @GET
    @Path("/process")
    @Produces(MediaType.APPLICATION_JSON)
    public Response processTest();

    @GET
    @Path("/wait/{time}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response waitTest(@PathParam("time") String time);

    @GET
    @Path("/random")
    @Produces(MediaType.APPLICATION_JSON)
    public Response randomTest();

    @GET
    @Path("/echo/{something}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response echoTest(@PathParam("something") String something);


    @GET
    @Path("/exception")
    @Produces(MediaType.APPLICATION_JSON)
    public Response exceptionScenario();
}
