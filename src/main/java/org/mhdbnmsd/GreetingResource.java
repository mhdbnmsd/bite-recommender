package org.mhdbnmsd;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    private record Output(String name){}

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Output hello() {
        return new Output("Greeting motherfucker");
    }
}
