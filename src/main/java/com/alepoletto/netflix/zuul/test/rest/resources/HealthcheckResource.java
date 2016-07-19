package com.alepoletto.netflix.zuul.test.rest.resources;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.inject.Singleton;
import netflix.karyon.health.HealthCheckHandler;

@Singleton
public class HealthcheckResource implements HealthCheckHandler{

    @Override
    public int getStatus() {
        return 200;
    }

}