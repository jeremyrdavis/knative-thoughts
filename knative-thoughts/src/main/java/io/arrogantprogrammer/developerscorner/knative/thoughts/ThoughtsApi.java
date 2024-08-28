package io.arrogantprogrammer.developerscorner.knative.thoughts;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/thoughts")
@Produces(MediaType.APPLICATION_JSON)
public class ThoughtsApi {

    @Inject
    ThoughtsService thoughtsService;

    @GET
    public Thought randomThought() {
        return thoughtsService.randomThought();
    }
}
