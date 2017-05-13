package com.simple.dropwizard.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
public class AppResource {
	
	public AppResource() {
		
	}
	
	@GET
	public Response Hello() {
	   return Response
	        .ok("{contact_id: " + 20 + ", name: \"Dummy Name\",phone: \"+0123456789\" }")
	        .build();
	 }
	
	
	  @GET
	  @Path("/{id}")
	  public Response getContact(@PathParam("id") int id) {
	   return Response
	        .ok("{contact_id: " + id + ", name: \"Dummy Name\",phone: \"+0123456789\" }")
	        .build();
	  }

}
