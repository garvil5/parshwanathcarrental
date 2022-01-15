<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>

<style type="text/css">
.inputform {
	float: left;
	width: 2000px;
	border: 1px solid pink;
	border-radius: 10px;
	padding: 10px;
}

.inputform table tr td input, textarea, select {
	width: 200px;
}

.inputform table tr td th input, textarea, select {
	align: left;
}

#gender1, #gender2 {
	width: 10px;
}

#submit {
	margin-left: 100px;
	width: 100px;
}

#reset {
	width: 100px;
}

.design {
	background-color: red;
	color: white;
	padding-left: 100px;
}
</style>

<script>
	var tableToExcel = (function() {
		var uri = 'data:application/vnd.ms-excel;base64,', template = '<html xmlns:o="urn:schemas-microsoft-com:office:office" xmlns:x="urn:schemas-microsoft-com:office:excel" xmlns="http://www.w3.org/TR/REC-html40"><head><!--[if gte mso 9]><xml><x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet><x:Name>{worksheet}</x:Name><x:WorksheetOptions><x:DisplayGridlines/></x:WorksheetOptions></x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook></xml><![endif]--></head><body><table>{table}</table></body></html>', base64 = function(
				s) {
			return window.btoa(unescape(encodeURIComponent(s)))
		}, format = function(s, c) {
			return s.replace(/{(\w+)}/g, function(m, p) {
				return c[p];
			})
		}
		return function(table, name) {
			if (!table.nodeType)
				table = document.getElementById(table)
			var ctx = {
				worksheet : name || 'Worksheet',
				table : table.innerHTML
			}
			window.location.href = uri + base64(format(template, ctx))
		}
	})()
</script>
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

	<h2>Parshwanath Car Rental</h2>
	<h3 style="background-color: red; color: red; width: 2000;">c</h3>
	<!-- body -->

	<div class="inputform">
		<input type="button" value="Entry" class="button"
			onClick="JavaScript:window.location='entryPage.jsp';"> <input
			type="button" value="Full Search" class="button"
			onClick="JavaScript:window.location='searchResult.jsp';"> <input
			type="button" value="Search By" class="button"
			onClick="JavaScript:window.location='searchBy.jsp';"> <input
			type="button" value="Search By Date" class="button"
			onClick="JavaScript:window.location='searchByDate.jsp';">

	</div>
	<br />
	<br />
	<br />

</body>
</html>