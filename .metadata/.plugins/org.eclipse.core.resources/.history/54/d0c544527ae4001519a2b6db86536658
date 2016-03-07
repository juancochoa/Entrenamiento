package com.servlet.propio;

import javax.ws.rs.*;
@Path("/jersey")
public class Jersey {

	@Path("/{mensaje}/{tamaño}")
	@GET
	@Produces("application/json; charset=utf-8")
	public Mensaje jerseyGet(@PathParam("mensaje") String descripcion, @PathParam("tamaño") int tamaño){
		System.out.println("oe");
		System.out.println(descripcion);
		return new Mensaje(descripcion, tamaño);
		
	}
	
	@POST
	@Produces("text/plain")
	public String jerseyPost(){
		return "oe";
		
	}
}
