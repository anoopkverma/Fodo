package com.internal.Fodo.guice;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {


    @Override
    protected void configure() {
        bind(Sender.class).to(SenderImpl.class);
    }
}
