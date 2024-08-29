package com.redhat.developerscorner.knative.thoughts.frontend;

import io.quarkus.logging.Log;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/thoughts")
public class FrontendApi {

    @RestClient
    ThoughtRESTClient thoughtRESTClient;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String thoughtOfTheDay() {
        Thought thought = thoughtRESTClient.thoughtOfTheDay();
        Log.debugf("Thought of the day: %s", thought);
        return "%s\n- %s".formatted(thought.text(), thought.author());
    }
}
