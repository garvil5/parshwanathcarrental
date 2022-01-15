package com.amzi.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entryBean;
import com.amzi.dao.entryPageValue;

public class entryPageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		entryBean.setPlaceFrom(request.getParameter("placeFrom").toUpperCase());
		entryBean.setPlaceTo(request.getParameter("placeTo").toUpperCase());
		entryBean.setGuestName(request.getParameter("guestName").toUpperCase());
		entryBean.setTravelName(request.getParameter("travelName").toUpperCase());
		entryBean.setGuestAddress(request.getParameter("guestAddress").toUpperCase());
		entryBean.setVehicleOwner(request.getParameter("vehicleOwner").toUpperCase());
		entryBean.setMobNumber(Long.parseLong(request.getParameter("mobNumber")));
		entryBean.setVehicle(request.getParameter("vehicle").toUpperCase());
		entryBean.setVehicleNumber(request.getParameter("vehicleNumber").toUpperCase());
		entryBean.setDriverName(request.getParameter("driverName").toUpperCase());
		entryBean.setDriverExpense(Integer.parseInt(request.getParameter("driverExpense")));
		entryBean.setRateKM(Integer.parseInt(request.getParameter("rateKM")));
		entryBean.setDieselExpense(Integer.parseInt(request.getParameter("dieselExpense")));
		entryBean.setToll(Integer.parseInt(request.getParameter("toll")));
		entryBean.setAdvance(Integer.parseInt(request.getParameter("advance")));
		entryBean.setRunKM(Integer.parseInt(request.getParameter("runKM")));
		entryBean.setDateFrom(request.getParameter("dateFrom"));
		entryBean.setDateTo(request.getParameter("dateTo"));
		entryBean.setTax(Integer.parseInt(request.getParameter("tax")));
		entryBean.setCommCheck(request.getParameter("commCheck").toUpperCase());
		entryBean.setCommissionPer(Integer.parseInt(request.getParameter("commissionPer")));
		entryBean.setPayment(request.getParameter("payment").toUpperCase());
		entryBean.setDays(Integer.parseInt(request.getParameter("days")));
		float checkKM = (entryBean.getRunKM()) / 250;
		System.out.println("Check KM:" + checkKM);
		int total;
		int grandTotal;
		if (checkKM >= entryBean.getDays()) {
			System.out.println("if");
			total = Integer.parseInt(request.getParameter("runKM")) * Integer.parseInt(request.getParameter("rateKM"));
			grandTotal = Integer.parseInt(request.getParameter("runKM"))
					* Integer.parseInt(request.getParameter("rateKM"))
					- Integer.parseInt(request.getParameter("advance")) + Integer.parseInt(request.getParameter("toll"));

		} else {
			System.out.println("else");
			total = 250 * entryBean.getDays() * Integer.parseInt(request.getParameter("rateKM"));
			grandTotal = 250 * entryBean.getDays() * Integer.parseInt(request.getParameter("rateKM"))
					- Integer.parseInt(request.getParameter("advance")) + Integer.parseInt(request.getParameter("toll"));
		}

//		int grandTotal = Integer.parseInt(request.getParameter("runKM"))
//				* Integer.parseInt(request.getParameter("rateKM")) - Integer.parseInt(request.getParameter("advance"))
//				+ Integer.parseInt(request.getParameter("toll"))-commission;
		int commission = total*entryBean.getCommissionPer()/100;
		System.out.println(total+" total-- comm:"+commission+"    "+entryBean.getCommissionPer()); 
		entryBean.setCommission(commission);
		entryBean.setTotal(total);
		grandTotal=grandTotal-commission;
		entryBean.setGrandTotal(grandTotal);
		RequestDispatcher rd = request.getRequestDispatcher("displayBeforeSave.jsp");
		rd.forward(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	public void checkNull() {
		

	}

}
