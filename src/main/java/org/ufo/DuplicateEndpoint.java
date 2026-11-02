package org.ufo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class DuplicateEndpoint {

    @Path("hello")
    public class GreetingResource {

        @GET
        @Produces(MediaType.TEXT_PLAIN)
        public String hello() {
            return "Manolo!";
        }
    }

    @Path("")
    public class GreetingResource2 {

        @Path("hello")
        @GET
        public String hello() {
            return "Mototui!";
        }
    }

}
