package com.myorg.javacourse;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class StockDetailsServlet extends HttpServlet {
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			resp.setContentType("text/html");
			Date date1 = new Date();
			date1.setYear(2014 - 1900);
			date1.setMonth(10);
			date1.setDate(15);
			Stock s1 = new Stock("PIH",(float) 13.1,(float) 12.4, date1);
			Stock s2 = new Stock("AAL",(float) 5.78,(float) 5.5,date1);
			Stock s3 = new Stock("CAAS",(float) 32.2,(float) 31.5,date1);
		
		
			
			resp.getWriter().println("<br/>"+s1.getHtmlDescription()+"<br/>"+s2.getHtmlDescription()+"<br/>"+s3.getHtmlDescription()+"<br/>");

}
}
