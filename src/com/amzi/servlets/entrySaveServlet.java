	package com.amzi.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entryBean;
import com.amzi.dao.entryPageValue;

public class entrySaveServlet extends HttpServlet {

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		entryBean.setTotal(Integer.parseInt(request.getParameter("total")));
		entryBean.setGrandTotal(Integer.parseInt(request.getParameter("grandTotal")));
		int check = entryPageValue.addValue();
		if (check == 1) {
			RequestDispatcher rd = request.getRequestDispatcher("entryPage.jsp");
			rd.forward(request, response);
		} else {
			out.print("<p style=\"color:red\">Sorry username or password error</p>");
			System.out.println("Sorry");
		}

		out.close();
	}

}
