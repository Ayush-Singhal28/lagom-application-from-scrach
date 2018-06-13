package com.example.ayush.example.impl;

import akka.NotUsed;
import com.example.ayush.example.api.ExampleService;
 import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.concurrent.CompletableFuture;


public class ExampleServiceImpl implements ExampleService {


    @Override
    public ServiceCall<NotUsed, String> hello() {
        return request -> CompletableFuture.completedFuture("hello");

    }
}
