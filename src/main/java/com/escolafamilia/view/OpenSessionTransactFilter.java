package com.escolafamilia.view;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.escolafamilia.connection.ConnectionFactory;

@WebFilter("/*")
public class OpenSessionTransactFilter implements Filter {

    public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		EntityManager entity = ConnectionFactory.getCurrentEntityManager();
		
		try{
			entity.getTransaction().begin();
			chain.doFilter(request, response);
			entity.getTransaction().commit();
		}
		catch(Exception e){
			if(entity.getTransaction().isActive())
				entity.getTransaction().rollback();
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			entity.close();
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
