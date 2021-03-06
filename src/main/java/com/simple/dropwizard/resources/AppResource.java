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

	  public int add(int a, int b) {
		  
		  return a+b;  
	  }
	  
	  public int subtrract(int a, int b) {
		  
		  if (a>b) {
			  return a-b;  
		  }
		  return b-a;  
	  }


	  public int multiply(int a, int b) {
	  
	  return a*b;  
	  }

	  public int divide(int a, int b) {
	  
		  if (a>b) {
			  return a/b;  
		  }
		  return b/a;  
	  }
}
