package com.escolafamilia.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.escolafamilia.connection.ConnectionFactory;

@WebListener
public class EntityManagerListener implements ServletContextListener {


	public void contextDestroyed(ServletContextEvent sce)  {
		ConnectionFactory.stop();
	}

	public void contextInitialized(ServletContextEvent sce)  {
		ConnectionFactory.start();
	}
	
}
