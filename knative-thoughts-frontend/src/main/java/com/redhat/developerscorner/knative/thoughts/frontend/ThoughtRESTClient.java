package com.redhat.developerscorner.knative.thoughts.frontend;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/thoughts")
@RegisterRestClient(configKey = "thoughts-api")
public interface ThoughtRESTClient {

    @GET
    Thought thoughtOfTheDay();
}
