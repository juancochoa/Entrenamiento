package com.servlet.propio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/servlet")
public class Serv extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("por aca");
		
		String mensaje=req.getParameter("mensaje");
		resp.setContentType("application/json");
		try (PrintWriter out=resp.getWriter()){
			out.println("oe");
			out.println("{ \"mensaje\":"+"\""+mensaje+"\"}");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("oe");
		StringBuffer mensaje= new StringBuffer();
		String line="";
		try (BufferedReader in=req.getReader()){
			while((line=in.readLine())!=null)
			mensaje.append(line);
		}
		ObjectMapper obj=new ObjectMapper();
		Mensaje msj=obj.readValue(mensaje.toString(), Mensaje.class);
		System.out.println(msj.getDescripcion());
		resp.setContentType("application/json");
		try (PrintWriter out=resp.getWriter()){
			obj.writeValue(out, msj);
		}
		
	}

}
