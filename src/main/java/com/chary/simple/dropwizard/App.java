package com.chary.simple.dropwizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chary.simple.dropwizard.resources.AppResource;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;


public class App extends Application<AppConfig> {
	
	private static final Logger LOGGER =LoggerFactory.getLogger(App.class);

	public static void main( String[] args ) throws Exception{
        new App().run(args);
    }
	
	@Override
	public void run(AppConfig appConfig, Environment environment) throws Exception {
		// TODO Auto-generated method stub
		LOGGER.info("Method App#run() called");
	    System.out.println( "Hello world, by Dropwizard!" );
	    for (int i=0; i < appConfig.getMessageRepetitions(); i++) {
	        System.out.println(appConfig.getMessage());
	    }
	 // Add the resource to the environment
	    environment.jersey().register(new AppResource());


	}

	@Override
	public void initialize(Bootstrap<AppConfig> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
