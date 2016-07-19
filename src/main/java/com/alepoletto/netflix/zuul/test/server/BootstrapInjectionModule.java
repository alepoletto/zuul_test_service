package com.alepoletto.netflix.zuul.test.server;

import com.alepoletto.netflix.zuul.test.injection.MainModule;
import com.netflix.governator.annotations.Modules;
import com.alepoletto.netflix.zuul.test.rest.resources.HealthcheckResource;
import netflix.adminresources.resources.KaryonWebAdminModule;
import netflix.karyon.KaryonBootstrap;
import netflix.karyon.ShutdownModule;
import netflix.karyon.archaius.ArchaiusBootstrap;
import netflix.karyon.eureka.KaryonEurekaModule;
import netflix.karyon.jersey.blocking.KaryonJerseyModule;
import netflix.karyon.servo.KaryonServoModule;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */

@ArchaiusBootstrap
@KaryonBootstrap(name = "zuul-test-service", healthcheck = HealthcheckResource.class)
@Modules(include = {
        ShutdownModule.class,
        BootstrapInjectionModule.KaryonJerseyModuleImpl.class,
        MainModule.class,
        KaryonEurekaModule.class,
})
public interface BootstrapInjectionModule {
    class KaryonJerseyModuleImpl extends KaryonJerseyModule {
        @Override
        protected void configureServer() {


            server().port(7001).threadPoolSize(100);

        }
    }
}