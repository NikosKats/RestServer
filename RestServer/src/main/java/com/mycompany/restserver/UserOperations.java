package com.mycompany.restserver;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserOperations {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMyUser() {
    //αναζήτηση στην βάση για τον χρήστη με το συγκεκριμένο id 
    //User myser = ....
        return Response.status(Response.Status.OK).entity("Helo").build();
    }
}
