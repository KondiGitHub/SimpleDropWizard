package com.simple.dropwizard.resources;
import static org.fest.assertions.api.Assertions.assertThat;

//import javax.ws.rs.core.MediaType;

//import org.junit.Before;
//import org.junit.ClassRule;
import org.junit.Test;
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

//import io.dropwizard.testing.junit.DropwizardAppRule;


public class AppResourceTest {
	
	@Test
	public void addTest() {
		AppResource appResource = new AppResource();
		assertThat(appResource.add(5, 5)).isEqualTo(10);

	}

}
