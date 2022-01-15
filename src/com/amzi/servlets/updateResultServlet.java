package com.amzi.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entryBean;
import com.amzi.dao.entryPageValue;

public class updateResultServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		entryBean.setsNo(Integer.parseInt(request.getParameter("sno")));
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
		entryBean.setDays(Integer.parseInt(request.getParameter("days")));
		entryBean.setTax(Integer.parseInt(request.getParameter("tax")));
		
		entryBean.setCommissionPer(Integer.parseInt(request.getParameter("commissionper")));
		entryBean.setTotal(Integer.parseInt(request.getParameter("runKM")) * Integer.parseInt(request.getParameter("rateKM")));
		entryBean.setCommission(Math.round(entryBean.getTotal()*entryBean.getCommissionPer()/100));
		int checkKM = (entryBean.getRunKM()) / 250;
		System.out.println("Check KM:" + checkKM);
		int total;
		int comm = entryBean.getCommissionPer();
		int commission;
		int grandTotal;
		if (checkKM >= entryBean.getDays()) {
			System.out.println("if");
			total = Integer.parseInt(request.getParameter("runKM")) * Integer.parseInt(request.getParameter("rateKM"));
			commission = (total * comm / 100);
			grandTotal = Integer.parseInt(request.getParameter("runKM"))
					* Integer.parseInt(request.getParameter("rateKM"))
					- Integer.parseInt(request.getParameter("advance")) + Integer.parseInt(request.getParameter("toll"))
					- commission;

		} else {
			System.out.println("else");
			total = 250 * entryBean.getDays() * Integer.parseInt(request.getParameter("rateKM"));
			commission = total * comm / 100;
			grandTotal = 250 * entryBean.getDays() * Integer.parseInt(request.getParameter("rateKM"))
					- Integer.parseInt(request.getParameter("advance")) + Integer.parseInt(request.getParameter("toll"))
					- commission;
		}
//		entryBean.setGrandTotal(Integer.parseInt(request.getParameter("runKM"))
//				* Integer.parseInt(request.getParameter("rateKM")) - Integer.parseInt(request.getParameter("advance"))
//				+ Integer.parseInt(request.getParameter("toll"))-entryBean.getCommission());
		entryBean.setCommission(commission);
		entryBean.setTotal(total);
		entryBean.setGrandTotal(grandTotal);
		entryBean.setPayment(request.getParameter("payment"));
		entryBean.setCommCheck(request.getParameter("commCheck"));
		entryPageValue.print();
		entryPageValue.updateValue();
		RequestDispatcher rd = request.getRequestDispatcher("updatedRecord.jsp");
		rd.forward(request, response);
	}
}
