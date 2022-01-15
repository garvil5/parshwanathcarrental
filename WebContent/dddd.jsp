<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Parshwanath Car Rental</title>
<script type="text/javascript">
function singleSelectChangeText() {
    //Getting Value
    

    var selObj = document.getElementById("singleSelectTextDDJS");
    var selValue = selObj.options[selObj.selectedIndex].text;
    
    //Setting Value
    document.getElementById("textFieldTextJS").value = selValue;
}
</script>
</head>
<body>

	<select id="singleSelectTextDDJS" class="form-control"
        onchange="singleSelectChangeText()">
        <option value="0">Select Value 0</option>
        <option value="8">Option value 8</option>
        <option value="5">Option value 5</option>
        <option value="4">Option value 4</option>
    </select>

    <input type="text" id="textFieldTextJS" class="form-control" 
    placeholder="get value on option select">

</body>
</html>