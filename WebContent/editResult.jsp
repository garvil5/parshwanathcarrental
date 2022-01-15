<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.entryBean"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "parshwanathcarrental";
String userid = "root";
String password = "root";
try {
	Class.forName(driver);
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parshwanath Car Rental</title>
</head>
<body>
	<%
	try {
		connection = DriverManager.getConnection(connectionUrl + database, userid, password);
		statement = connection.createStatement();
		String sql = "select * from ledgerentry where sno='" + request.getParameter("id") + "'";
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
	%>
	<jsp:include page="menu.jsp" />
	<div class="inputform">
		<h2 class="design">Review</h2>
		<form action="updateResultServlet" method="post">
			<input type="hidden" name="sno"
				value="<%=resultSet.getString("sno")%>">
			<table>

				<tr>
					<th align="left">Place From:</th>
					<td><input type=text name="placeFrom"
						value="<%=resultSet.getString("placeFrom")%>"></td>
				</tr>
				<tr>
					<th align="left">Place To:</th>
					<td><input type=text name="placeTo"
						value="<%=resultSet.getString("placeto")%>"></td>
				</tr>
				<tr>
					<th align="left">Guest Name:</th>
					<td><input type=text name="guestName"
						value="<%=resultSet.getString("guestName")%>"></td>
				</tr>
				<tr>
					<th align="left">Travel's Name:</th>
					<td><input type=text name="travelName"
						value="<%=resultSet.getString("travelName")%>"></td>
				</tr>
				<tr>
					<th align="left">Guest Address:</th>
					<td><input type=text name="guestAddress"
						value="<%=resultSet.getString("guestAddress")%>"></td>
				</tr>
				<tr>
					<th align="left">Mobile Number:</th>
					<td><input type=text name="mobNumber"
						value="<%=resultSet.getString("mobNumber")%>"></td>
				</tr>
				<tr>
					<th align="left">Date From:</th>
					<td><input type=text name="dateFrom"
						value="<%=resultSet.getString("dateFrom")%>"></td>
				</tr>
				<tr>
					<th align="left">Date To:</th>
					<td><input type=text name="dateTo"
						value="<%=resultSet.getString("dateTo")%>"></td>
				</tr>
				<tr>
					<th align="left">Days:</th>
					<td><input type=text name="days"
						value="<%=resultSet.getString("days")%>"></td>
				</tr>
				<tr>
					<th align="left">Vehicle Type:</th>
					<td><input type=text name="vehicle"
						value="<%=resultSet.getString("vehicle")%>"></td>
				</tr>
				<tr>
					<th align="left">Vehicle Number:</th>
					<td><input type=text name="vehicleNumber"
						value="<%=resultSet.getString("vehicleNumber")%>"></td>
				</tr>
				<tr>
					<th align="left">Vehicle Owner:</th>
					<td><input type=text name="vehicleOwner"
						value="<%=resultSet.getString("vehicleOwner")%>"></td>
				</tr>
				<tr>
					<th align="left">Driver Name:</th>
					<td><input type=text name="driverName"
						value="<%=resultSet.getString("driverName")%>"></td>
				</tr>
				<tr>
					<th align="left">Driver Expense:</th>
					<td><input type=text name="driverExpense"
						value="<%=resultSet.getString("driverExpense")%>"></td>
				</tr>
				<tr>
					<th align="left">Run KM:</th>
					<td><input type=text name="runKM"
						value="<%=resultSet.getString("rumkm")%>"></td>
				</tr>
				<tr>
					<th align="left">Rate per KM:</th>
					<td><input type=text name="rateKM"
						value="<%=resultSet.getString("rateKM")%>"></td>
				</tr>
				<tr>
					<th align="left">Commission %:</th>
					<td><input type=text name="commissionper"
						value="<%=resultSet.getString("commissionper")%>"></td>
				</tr>
				<tr>
					<th align="left">Toll:</th>
					<td><input type=text name="toll"
						value="<%=resultSet.getString("toll")%>"></td>
				</tr>
				<tr>
					<th align="left">Tax:</th>
					<td><input type=text name="tax"
						value="<%=resultSet.getString("tax")%>"></td>
				</tr>
				<tr>
					<th align="left">Diesel Expense:</th>
					<td><input type=text name="dieselExpense"
						value="<%=resultSet.getString("dieselExpense")%>"></td>
				</tr>
				<tr>
					<th align="left">Advance:</th>
					<td><input type=text name="advance"
						value="<%=resultSet.getString("advance")%>"></td>
				</tr>

				<tr>
					<th align="left">Payment:</th>
					<td><select id="pay" name="payment">
							<option value=<%=resultSet.getString("payment")%>><%=resultSet.getString("payment")%></option>
							<option value="UPPAID">Payment Due</option>
							<option value="PAID">Payment Done</option>
					</select></td>
				</tr>
				<tr>
					<th align="left">Commission:</th>
					<td><select id="com" name="commCheck">
							<option value=<%=resultSet.getString("commCheck")%>><%=resultSet.getString("commCheck")%></option>
							<option value="UPPAID">Commission Due</option>
							<option value="PAID">Commission Done</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="Submit" value="Update" class="button" /></td>
				</tr>
			</table>
		</form>
		<%
		}
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		%>
	</div>



</body>
</html>