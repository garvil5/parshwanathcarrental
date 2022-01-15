
<%@page import="com.entryBean"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import="com.entryBean"%>
<%@ page import="java.util.Date"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Parshwanath Car Rental</title>
</head>
<body>
	<%
	entryBean entry = new entryBean();
	String placeFrom = entry.placeFromValue();
	String placeTo = entry.placeToValue();
	String guestName = entry.guestNameValue();
	String travelName = entry.travelNameValue();
	String guestAddress = entry.guestAddressValue();
	Long mobNumber = entry.mobNumberValue();
	String vehicle = entry.vehicleValue();
	String vehicleNumber = entry.vehicleNumberValue();
	String driverName = entry.driverNameValue();
	int driverExpense = entry.driverExpenseValue();
	int rateKM = entry.rateKMValue();
	int dieselExpense = entry.dieselExpenseValue();
	int toll = entry.tollValue();
	int advance = entry.advanceValue();
	String vehicleOwner = entry.vehicleOwnerValue();
	int total = entry.totalValue();
	int grandTotal = entry.grandTotalValue();
	int runKM = entry.runKMValue();
	String dateFrom = entry.dateFromValue();
	String dateTo = entry.dateToValue();
	String payment=entry.payment();
	//String commPayment=entry.commPayment();
	int commission=entry.commission();
	int commissionPer=entry.commissionPer();
	int days=entry.days();
	int tax=entry.tax();
	String commCheck=entry.commCheck();
	
	%>

	<jsp:include page="menu.jsp" />
	<div class="inputform">
		<h2 class="design">Review</h2>
		<form action="entrySaveServlet" method="post">

			<table>
				<tr>
					<th align="left">Place From:</th>
					<td><%=placeFrom%></td>
				</tr>
				<tr>
					<th align="left">Place To:</th>
					<td><%=placeTo%></td>
				</tr>
				<tr>
					<th align="left">Guest Name:
					</td>
					<td><%=guestName%></td>
				</tr>
				<tr>
					<th align="left">Travel's Name:</th>
					<td><%=travelName%></td>
				</tr>
				<tr>
					<th align="left">Guest Address:</th>
					<td><%=guestAddress%></td>
				</tr>
				<tr>
					<th align="left">Mobile Number:</th>
					<td><%=mobNumber%></td>
				</tr>
				<tr>
					<th align="left">Date From:</th>
					<td><%=dateFrom%></td>
				</tr>
				<tr>
					<th align="left">Date To:</th>
					<td><%=dateTo%></td>
				</tr>
				<tr>
					<th align="left">Days:</th>
					<td><%=days%></td>
				</tr>
				<tr>
					<th align="left">Vehicle Type:</th>
					<td><%=vehicle%></td>
				</tr>
				<tr>
					<th align="left">Vehicle Number:</th>
					<td><%=vehicleNumber%></td>
				</tr>
				<tr>
					<th align="left">Vehicle Owner:</th>
					<td><%=vehicleOwner%></td>
				</tr>
				<tr>
					<th align="left">Driver Name:</th>
					<td><%=driverName%></td>
				</tr>
				<tr>
					<th align="left">Driver Expense:</th>
					<td><%=driverExpense%></td>
				</tr>
				<tr>
					<th align="left">Running KM:</th>
					<td><%=runKM%></td>
				</tr>
				<tr>
					<th align="left">Rate per KM:</th>
					<td><%=rateKM%></td>
				</tr>
				<tr>
					<th align="left">Commission Percentage:</th>
					<td><%=commissionPer %></td>
				</tr>
				
				<tr>
					<th align="left">Toll:</th>
					<td><%=toll%></td>
				</tr>
				<tr>
					<th align="left">Tax:</th>
					<td><%=tax%></td>
				</tr>
				<tr>
					<th align="left">Diesel Expense:</th>
					<td><%=dieselExpense%></td>
				</tr>
				<tr>
					<th align="left">Advance:</th>
					<td><%=advance%></td>
				</tr>
				<tr>
					<th align="left">Commission</th>
					<td><%=commission %></td>
				</tr>
				<tr>
					<th align="left">Payment</th>
					<td><%=payment %></td>
				</tr>
				<tr>
					<th align="left">Commission</th>
					<td><%=commCheck %></td>
				</tr>
				
				<tr>
					<th align="left">Total:</th>
					<td><input type="text" name="total" value="<%=total%>" /></td>
				</tr>
				<tr>
					<th align="left">Grand Total:</th>
					<td><input type="text" name="grandTotal"
						value="<%=grandTotal%>" /></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="Submit" value="Save" class="button" /></td>
				</tr>
			</table>
		</form>
	</div>



</body>
</html>