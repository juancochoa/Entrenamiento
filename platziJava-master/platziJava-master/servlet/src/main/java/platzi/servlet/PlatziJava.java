/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package platzi.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
@WebServlet(urlPatterns = ("/saludopai"),
        initParams = {
    @WebInitParam(name= "estado", value="camilito")
})
public class PlatziJava extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("campo");
        String aux2 = req.getAttribute("segundoEstado").toString();
        resp.setContentType("application/json");
        String estado = getServletConfig().getInitParameter("estado");
        System.out.println(getServletConfig().getInitParameter("estado"));
        try (PrintWriter out = resp.getWriter()) {
            out.println("{\"message\": \"" + message + "\"}");
            out.println("{\"message\": \"" + aux2 + "\"}");
            out.println("{\"message\": \"" + estado + "\"}");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Line;
        StringBuffer json = new StringBuffer();
        try (BufferedReader reader = req.getReader()) {
            while ((Line = reader.readLine()) != null) {
                json.append(Line);
            }
        }
        System.out.println(json.toString());
        ObjectMapper mapper = new ObjectMapper();
        Message message = mapper.readValue(json.toString(), Message.class);
        System.out.println("size json: " + message.getSize());
        System.out.println("numero json: " + message.getNumero());
    }
}
