package com.servlet.propio;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientResponse;

import java.net.URI;

public class JerseyClient {

	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		String msj = target.path("vamos/6").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		Form form=new Form();
		form.param("msj", msj);
		Response response=target.request(MediaType.TEXT_PLAIN_TYPE).post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED));
		Response response2=target.request(MediaType.TEXT_PLAIN_TYPE).put(Entity.entity(msj, MediaType.APPLICATION_JSON));

		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
		System.out.println(response2.getStatus());
		System.out.println(response2.readEntity(String.class));
	}

	private static URI getBaseURI() {
		return UriBuilder.fromUri("http://localhost:8080/servlet-platzi/rest/jersey").build();
	}
}
