package com.copa.archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

@Path("/archivo")
public class ArchivoJersey {

	@POST
	@Path("/lectura")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public void guardarArchivo(@Suspended AsyncResponse ar, @FormDataParam("file") InputStream fileInputStream,
			@FormDataParam("file") FormDataContentDisposition contentDispositionHeader) throws IOException {
		String nombreArchivo=contentDispositionHeader.getFileName();
		System.out.println(nombreArchivo);
		String extensionArchivo=nombreArchivo.lastIndexOf(".")==-1?null:nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
		int read = 0;
        byte[] bytes = new byte[1024];
		try {
			OutputStream out=new FileOutputStream(new File("/Entrenamiento/pruebaJersey/prueba.pdf"));
			while((read=fileInputStream.read(bytes))!=-1){
				out.write(bytes, 0, read);
			}
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ar.resume("carga");
	}
	
	@GET
	@Path("/lectura")
	public String prueba(){
		return "mensaje";
	}
}
