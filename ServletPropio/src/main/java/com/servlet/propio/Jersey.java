package com.servlet.propio;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/jersey")
public class Jersey {

	@Path("/{mensaje}/{tamaño}")
	@GET
	@Produces({MediaType.APPLICATION_JSON + "; charset=UTF-8", MediaType.TEXT_PLAIN})
	public Mensaje jerseyGet(@PathParam("mensaje") String descripcion, @PathParam("tamaño") int tamaño){
		System.out.println("oe");
		System.out.println(descripcion);
		return new Mensaje(descripcion, tamaño);
	}
	
	@POST
	@Produces("text/plain")
	public String jerseyPost(@FormParam("msj") String mensaje){
		return mensaje;
		
	}
	@PUT
	@Produces("text/plain")
	public String jerseyPut(String mensaje){
		return mensaje;
		
	}
}
