package com.servlet.propio;



import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value={"tamaño"})
public class Mensaje {
	private String descripcion;
	private int tamaño;
	
	public Mensaje(){
		
	}
	public Mensaje(String descripcion, int tamaño) {
		this.descripcion = descripcion;
		this.tamaño = tamaño;
	}
	//@JsonIgnore
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescipcion(String descipcion) {
		this.descripcion = descipcion;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
}
