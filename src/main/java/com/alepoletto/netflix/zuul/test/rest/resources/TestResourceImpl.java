package com.alepoletto.netflix.zuul.test.rest.resources;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.Random;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */
public class TestResourceImpl implements TestResource {

    @Override
    public Response echoTest(@PathParam("something") String something) {
        return Response.ok(something).build();
    }

    @Override
    public Response processTest() {
        putThreadToSleep(500);
        return Response.ok("done in 500 mileseconds").build();
    }

    @Override
    public Response waitTest(@PathParam("time") String time) {
        putThreadToSleep(Integer.valueOf(time));
        System.out.println("esperando..." + time);
        return Response.ok(time).build();
    }

    private void putThreadToSleep(Integer timeToSleep) {
        try {
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Response randomTest() {
       switch (new Random().nextInt(3)){
           case 0: return  Response.ok("foi rapido").build();
           case 1:
               putThreadToSleep(2000);
               return Response.ok("foi medio").build();
           case 2:
               putThreadToSleep(3000);
               return Response.ok("foi demorado").build();
           default:
               return Response.serverError().build();
       }
    }

    @Override
    public Response exceptionScenario() {
        return Response.serverError().build();
    }
}
