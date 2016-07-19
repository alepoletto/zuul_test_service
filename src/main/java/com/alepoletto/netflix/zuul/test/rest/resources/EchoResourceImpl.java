package com.alepoletto.netflix.zuul.test.rest.resources;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */
public class EchoResourceImpl implements EchoResource {

    @Override
    public Response echo(@PathParam("word") String word) {
        return Response.ok(word).build();
    }
}
