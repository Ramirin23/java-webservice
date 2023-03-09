package com.webservice.java_webservice;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("people")
public class PersonaResource 
{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	//@Produces(MediaType.APPLICATION_XML)
	public String getRamiro() 
	{
		return "Ramiro estuvo aqui";
	}
	
	
}


