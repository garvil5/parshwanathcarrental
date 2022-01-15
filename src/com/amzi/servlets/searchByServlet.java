package com.amzi.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entryBean;

public class searchByServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("searchBy") != null && request.getParameter("dateTo") == null
				&& request.getParameter("dateFrom") == null) {
			entryBean.setQuery("select * from ledgerentry where " + request.getParameter("vehicleSearch") + " LIKE '%"
					+ request.getParameter("searchBy").toUpperCase() + "%'");
			System.out.println("Query: " + entryBean.getQuery());
			RequestDispatcher rd = request.getRequestDispatcher("searchBy.jsp");
			rd.forward(request, response);
		} else if (request.getParameter("searchBy") == null && request.getParameter("dateTo") != null
				&& request.getParameter("dateFrom") != null) {
			entryBean.setQuery("select * from ledgerentry where `datefrom` BETWEEN '" + request.getParameter("dateFrom")
					+ "' AND '" + request.getParameter("dateTo") + "'");
			System.out.println("Query: " + entryBean.getQuery());
			RequestDispatcher rd = request.getRequestDispatcher("searchByDate.jsp");
			rd.forward(request, response);
		} else {
			entryBean.setQuery("select * from ledgerentry");
			System.out.println("Query: " + entryBean.getQuery());
			RequestDispatcher rd = request.getRequestDispatcher("searchResult.jsp");
			rd.forward(request, response);
		}

		RequestDispatcher rd = request.getRequestDispatcher("searchBy.jsp");
		rd.forward(request, response);

	}
}