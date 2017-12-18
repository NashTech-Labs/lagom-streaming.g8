package com.knoldus.streaming.api;

import akka.stream.javadsl.Source;
import com.knoldus.streaming.model.ProductRequest;
import com.knoldus.streaming.model.ProductResponse;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.named;

public interface StreamingService extends Service {

    ServiceCall<ProductRequest, Source<ProductResponse, ?>> oneWayStreaming();

    ServiceCall<Source<ProductRequest, ?>, Source<ProductResponse, ?>> twoWayStreaming();

    @Override
    default Descriptor descriptor() {
        return named("streaming").withCalls(
                Service.pathCall("/api/streaming/oneWay", this::oneWayStreaming),
                Service.pathCall("/api/streaming/twoWay", this::twoWayStreaming)
        ).withAutoAcl(true);
    }
}