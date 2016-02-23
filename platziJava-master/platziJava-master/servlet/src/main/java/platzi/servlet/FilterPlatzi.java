/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package platzi.servlet;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 *
 * @author HP
 */
@WebFilter(filterName = "FilterPlatzi",
        urlPatterns = ("/*"),
        initParams = {
    @WebInitParam(
            name = "estado",
            value = "hola cami")})
public class FilterPlatzi implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Enumeration as=filterConfig.getInitParameterNames();
        System.out.println("oe");
        while(as.hasMoreElements()){
            String oe=as.nextElement().toString();
            System.out.println("oeoe "+ oe);
            System.out.println("ja "+filterConfig.getInitParameter(oe));
        }
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setAttribute("segundoEstado", "oe");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }
}
