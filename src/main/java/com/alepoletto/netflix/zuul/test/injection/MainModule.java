package com.alepoletto.netflix.zuul.test.injection;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.alepoletto.netflix.zuul.test.rest.resources.EchoResource;
import com.alepoletto.netflix.zuul.test.rest.resources.EchoResourceImpl;
import com.alepoletto.netflix.zuul.test.rest.resources.TestResource;
import com.alepoletto.netflix.zuul.test.rest.resources.TestResourceImpl;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */
public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(EchoResource.class).to(EchoResourceImpl.class).in(Singleton.class);
        bind(TestResource.class).to(TestResourceImpl.class).in(Singleton.class);
    }
}
