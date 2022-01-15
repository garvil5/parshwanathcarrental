<%@page import="com.entryBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<style>
.button {
	background-color: RED;
	border: none;
	color: white;
	padding: 10px 25px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 12px;
	margin: 4px 2px;
	cursor: pointer;
}
</style>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<div class="inputform">
		<h2 class="design">Search Result</h2>
		<input type="button" class="button"
			onclick="tableToExcel('testTable', 'Report')"
			value="Export to Excel">

		<table id="testTable" cellpadding="5"
			summary="Code page support in different versions of MS Windows."
			rules="groups" frame="hsides" border="2">
			<tr>
				<th>Place From</th>
				<th>Place To</th>
				<th>Guest Name</th>
				<th>Travel Name</th>
				<th>Guest Address</th>
				<th>Mobile Number</th>
				<th>Date From</th>
				<th>Date To</th>
				<th>Days</th>
				<th>Vehicle Type</th>
				<th>Vehicle Number</th>
				<th>VehicleOwner</th>
				<th>Driver Name</th>
				<th>Driver Expense</th>
				<th>Running KM</th>
				<th>Rate KM</th>
				<th>Commission %</th>
				<th>Diesel Expense</th>
				<th>Toll</th>
				<th>Tax</th>
				<th>Advance</th>
				<th>Commission</th>
				<th>Total</th>
				<th>Grand Total</th>
				<th>Payment</th>
				<th>Commission</th>
				<th>Edit</th>
			</tr>
			<%
			try {
				connection = DriverManager.getConnection(connectionUrl + database, userid, password);
				statement = connection.createStatement();
				String sql = "select * from ledgerentry";
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
			%>
			<tr>

				<td><%=resultSet.getString("placeFrom")%></td>
				<td><%=resultSet.getString("placeTo")%></td>
				<td><%=resultSet.getString("guestName")%></td>
				<td><%=resultSet.getString("travelName")%></td>
				<td><%=resultSet.getString("guestAddress")%></td>
				<td><%=resultSet.getString("mobNumber")%></td>
				<td><%=resultSet.getString("datefrom")%></td>
				<td><%=resultSet.getString("dateto")%></td>
				<td><%=resultSet.getString("days")%></td>
				<td><%=resultSet.getString("vehicle")%></td>
				<td><%=resultSet.getString("vehicleNumber")%></td>
				<td><%=resultSet.getString("vehicleOwner")%></td>
				<td><%=resultSet.getString("driverName")%></td>
				<td><%=resultSet.getString("driverExpense")%></td>
				<td><%=resultSet.getString("rumkm")%></td>
				<td><%=resultSet.getString("rateKM")%></td>
				<td><%=resultSet.getString("commissionper")%>
				<td><%=resultSet.getString("dieselExpense")%></td>
				<td><%=resultSet.getString("toll")%></td>
				<td><%=resultSet.getString("tax")%></td>
				<td><%=resultSet.getString("advance")%></td>
				<td><%=resultSet.getString("commission")%>
				<td><%=resultSet.getString("total")%></td>
				<td><%=resultSet.getString("grandtotal")%></td>
				<td><%=resultSet.getString("payment")%>
				<td><%=resultSet.getString("commCheck")%>
				<td><a href="editResult.jsp?id=<%=resultSet.getString("sno")%>">Edit</a></td>
			</tr>
			<%
			}
			connection.close();
			} catch (Exception e) {
			e.printStackTrace();
			}
			%>
		</table>
	</div>

</body>
</html>