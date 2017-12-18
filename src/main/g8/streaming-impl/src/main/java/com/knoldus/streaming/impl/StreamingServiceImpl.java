package com.knoldus.streaming.impl;

import akka.stream.javadsl.Source;
import com.knoldus.streaming.api.StreamingService;
import com.knoldus.streaming.model.ProductRequest;
import com.knoldus.streaming.model.ProductResponse;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class StreamingServiceImpl implements StreamingService {

    @Override
    public ServiceCall<ProductRequest, Source<ProductResponse, ?>> oneWayStreaming() {
        return (request ->
                CompletableFuture.completedFuture(Source.from(request.getProducts())
                        .mapAsync(1, product -> prepareProductResponse(product, request.getCategory()))));
    }

    @Override
    public ServiceCall<Source<ProductRequest, ?>, Source<ProductResponse, ?>> twoWayStreaming() {
        return (request ->
                CompletableFuture.completedFuture(request.mapAsync(1,
                        productRequest -> prepareProductResponse(productRequest.getProducts().get(0),
                                productRequest.getCategory()))));
    }


    private CompletionStage<ProductResponse> prepareProductResponse(String product, String category) {
        return CompletableFuture.completedFuture(new ProductResponse() {{
            setCategory(category);
            setProduct(product);
        }});
    }
}
