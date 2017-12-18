package com.knoldus.streaming.impl;

import com.google.inject.AbstractModule;
import com.knoldus.streaming.api.StreamingService;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class StreamingModule extends AbstractModule implements ServiceGuiceSupport {

    @Override
    protected void configure() {
        bindService(StreamingService.class, StreamingServiceImpl.class);
    }
}
