package com.alepoletto.netflix.zuul.test.server;

import com.netflix.governator.guice.BootstrapModule;
import netflix.karyon.Karyon;

/**
 * Created by Alexandre Poletto on 22/04/2016.
 */
public class MainRunner {
    public static void main(String[] args) {
        System.setProperty("java.awt.headless","true");
        Karyon.forApplication(BootstrapInjectionModule.class, (BootstrapModule []) null).startAndWaitTillShutdown();


    }
}
