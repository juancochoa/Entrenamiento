package com.copa.archivos;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
@ApplicationPath("pdf")
public class AppConfig extends Application{
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(ArchivoJersey.class);
        resources.add(MultiPartFeature.class);
        return resources;
	}
}
