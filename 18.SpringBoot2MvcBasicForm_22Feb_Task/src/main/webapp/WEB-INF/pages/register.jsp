<!DOCTYPE html>
<html>
<head>
<title>Student Register</title>
</head>
<body>
<form action="/student/save" method="post">
<pre>
Student Id : <input type="text" name="sid">

Student Name : <input type="text" name="sname">

Student Fee : <input type="text" name="sfee">

Student Gender : <input type="radio" name="sgender" value="Male"> Male
				 <input type="radio" name="sgender" value="Female"> Female
				 
Student Address : <input type="text" name="saddress">

Student Mobile No : <input type="text" name="smobileno">

Student Email Id : <input type="text" name="semail">

Student Course : <select name="scourse">
					<option value="">-SELECT--</option>
						<option value="Java">Java</option>
						<option value="JSP">JSP</option>
						<option value="Servlet">Servlet</option>
				 </select>

Time Slots : <input type="checkbox" name="timeslots" value="09 AM"> 09 AM
			 <input type="checkbox" name="timeslots" value="11 AM"> 11 AM
			 <input type="checkbox" name="timeslots" value="07 AM"> 07 AM
			 <input type="checkbox" name="timeslots" value="08 AM"> 08 AM
			 
Student Certificates : <select name="certificates" multiple>
						<option value="JAVA">JAVA</option>
						<option value="JSP">JSP</option>
						<option value="Servlet">Servlet</option>
						<option value="J2EE">J2EE</option>
					  </select>
					  
					  <input type="submit" value="Submit">
</pre>
</form>
</body>
</html>

