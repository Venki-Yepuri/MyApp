package com.myapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.log4j.Logger;

public class HelloWorldServlet extends GenericServlet {
	/**
	 * 
	 */Logger logger = Logger.getLogger(HelloWorldServlet.class);
	
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		logger.info("*************************************");
		logger.info("Venkiiiiiiiiiiiiiiiiiiiiiiiiiii");
		logger.info("*************************************");
		logger.error("=========================================");
		logger.error("Yepuriiiiiiiiiiiiiiiiiiiiiiiiiiii");
		logger.error("=========================================");
		logger.debug("|||||||||||||||||||||||||||||||||||||||||||");
		logger.debug("Venkiiiiiiiiiiiiiiiiiii    Yepuriiiiiiiiiiiiiiiiiiiiiiiii");
		logger.debug("|||||||||||||||||||||||||||||||||||||||||||");
		
		System.out.println("=====================From Sys Out=================");
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("Hello World From HelloWorldServlet");
		pw.close();
	}
}
