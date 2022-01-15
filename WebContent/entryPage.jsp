<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parshwanath Car Rental</title>
<script>
function validateForm() {
  var x = document.forms["myForm"]["placeFrom"]["placeTo"].value;
  if (x == "" || x == null) {
    alert("Name must be filled out");
    return false;
  }
}
</script>
<script type="text/javascript">
	function showdv(obj, id1, id2, id3, id4, id5, id6) {

		txt = obj.options[obj.selectedIndex].text;
		document.getElementById("box").style.display = 'none';

		if (txt.match(id1)) {
			document.getElementById("box").style.display = 'block';
			//document.getElementById("boxx").value = txt
		}

		if (txt.match(id2)) {
			document.getElementById("box").style.display = 'block';
			document.getElementById("boxx").value = txt
		}
		if (txt.match(id3)) {
			document.getElementById("box").style.display = 'block';
			document.getElementById("boxx").value = txt
		}
		if (txt.match(id4)) {
			document.getElementById("box").style.display = 'block';
			document.getElementById("boxx").value = txt
		}
		if (txt.match(id5)) {
			document.getElementById("box").style.display = 'block';
			document.getElementById("boxx").value = txt
		}
		if (txt.match(id6)) {
			document.getElementById("box").style.display = 'block';
			document.getElementById("boxx").value = txt
		}

	}
</script>
</head>
<body>

	<jsp:include page="menu.jsp" />
	<div class="inputform">
		<h2 class="design">Entry Page</h2>

		<form name="myForm" action="entryPageServlet" method="post" >
			<table>


				<tr>
					<th align="left">Place From:</th>
					<td><input type="text" name="placeFrom" required /></td>
				</tr>
				<tr>
					<th align="left">Place To:</th>
					<td><input type="text" name="placeTo" required/></td>
				</tr>
				<tr>
					<th align="left">Guest Name:</th>
					<td><input type="text" name="guestName" required /></td>
				</tr>
				<!-- 				 required="required" -->
				<tr>
					<th align="left">Travel's Name:</th>
					<td><input type="text" name="travelName" required/></td>
				</tr>
				<tr>
					<th align="left">Guest Address:</th>
					<td><input type="text" name="guestAddress" required/></td>
				</tr>
				<tr>
					<th align="left">Mobile Number:</th>
					<td><input type="text" name="mobNumber" /></td>
				</tr>
				<tr>
					<th align="left">Date From:</th>
					<td><input type="date" name="dateFrom" /></td>
				</tr>
				<tr>
					<th align="left">Date To:</th>
					<td><input type="date" name=dateTo /></td>
					<%-- 					<td> <input type="date" name="dateTo" value="<%=dateFromDB%>" /></td> --%>
				</tr>
				<tr>
					<th align="left">Days:</th>
					<td><input type="text" name="days" required/></td>
				</tr>
				<tr>
					<th align="left">Vehicle Type:</th>
					<td><select id="opts"
						onchange="showdv(this,'Innova Crysta','Ertiga','Swift Dzire','Honda Amaze','traveler');">
							<option value="0">Select</option>
							<option value="INNOVA CRYSTA">Innova Crysta</option>
							<option value="ERTIGA">Ertiga</option>
							<option value="SWIFT DZIRE">Swift Dzire</option>
							<option value="HONDA AMAZE">Honda Amaze</option>
							<option value="TRAVELER">Traveler</option>
					</select>
					<td>
						<div id="box" style="display: none;">
							<input Type="text" id="boxx" name="vehicle" maxlength="30">
						</div>
					</td>
				</tr>
				<tr>
					<th align="left">Vehicle Number:</th>
					<td><input type="text" name="vehicleNumber" required/></td>
				</tr>
				<tr>
					<th align="left">Vehicle Owner:</th>
					<td><input type="text" name="vehicleOwner" required/></td>
				</tr>
				<tr>
					<th align="left">Driver Name:</th>
					<td><input type="text" name="driverName" required/></td>
				</tr>
				<tr>
					<th align="left">Driver Expense:</th>
					<td><input type="text" name="driverExpense" required/></td>
				</tr>
				<tr>
					<th align="left">Running KM:</th>
					<td><input type="text" name="runKM" required/></td>
				</tr>

				<tr>
					<th align="left">Rate per KM:</th>
					<td><input type="text" name="rateKM" required/></td>
				</tr>
				<tr>
					<th align="left">Commission Percentage:</th>
					<td><input type="text" name="commissionPer" required/></td>
				</tr>
				
				<tr>
					<th align="left">Toll:</th>
					<td><input type="text" name="toll" /></td>
				</tr>
				<tr>
					<th align="left">Tax:</th>
					<td><input type="text" name="tax" /></td>
				</tr>
				<tr>
					<th align="left">Diesel Expense:</th>
					<td><input type="text" name="dieselExpense" required/></td>
				</tr>
				<tr>
					<th align="left">Advance:</th>
					<td><input type="text" name="advance" required/></td>
				</tr>
				<tr>
					<th align="left">Payment:</th>
					<td><select id="pay" name="payment">
							<option>Select</option>
							<option value="UNPAID">Payment Due</option>
							<option value="PAID">Payment Done</option>
					</select></td>
				</tr>
				<tr>
					<th align="left">Commission:</th>
					<td><select id="com" name="commCheck">
							<option>Select</option>
							<option value="UNPAID">Commission Due</option>
							<option value="PAID">Commission Done</option>
					</select></td>
				</tr>



				<tr>
					<td></td>
					<td><input type="Submit" value="Review" class="button" /></td>
				</tr>
			</table>
		</form>
	</div>



</body>
</html>