package com.example.ayush.example.api;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.Method;

import static com.lightbend.lagom.javadsl.api.Service.named;


public interface ExampleService extends Service {

    ServiceCall<NotUsed, String> hello();

    @Override
    default Descriptor descriptor() {
        return named("hello").withCalls(
                Service.restCall(Method.GET,"/api/id", this::hello)
        ).withAutoAcl(true);

    }
}
