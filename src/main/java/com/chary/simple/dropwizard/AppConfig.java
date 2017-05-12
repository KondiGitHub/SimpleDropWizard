package com.chary.simple.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;


public class AppConfig extends Configuration {
	
	@JsonProperty
	  private String message;

	  @JsonProperty
	  private int messageRepetitions;

	  public String getMessage() {
	    return message;
	  }

	  public int getMessageRepetitions() {
	    return messageRepetitions;
	  }


}
