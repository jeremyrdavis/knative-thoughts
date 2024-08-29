package com.redhat.developerscorner.knative.thoughts.frontend;

import io.quarkus.logging.Log;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/")
public class FrontendApi {

    @RestClient
    ThoughtRESTClient thoughtRESTClient;

    @Inject
    Template thought;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance thoughtOfTheDay() {
        Thought thoughtOfTheDay = thoughtRESTClient.thoughtOfTheDay();
        Log.debugf("Thought of the day: %s", thoughtOfTheDay);
        return thought.data("author", thoughtOfTheDay.author()).data("text", thoughtOfTheDay.text());
//        return "%s\n- %s".formatted(thought.text(), thought.author());
    }
}
