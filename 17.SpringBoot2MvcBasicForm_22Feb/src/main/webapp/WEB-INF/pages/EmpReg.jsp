<html>
<body>
	<h3>WELCOME TO EMPLOYEE REGISTER PAGE!</h3>
	<form action="save" method="POST">
		<pre>
			ID : <input type="text" name="empId" />
			NAME : <input type="text" name="empName" />
			SAL : <input type="text" name="empSal" />
			
			GENDER:
					<input type="radio" name="empGen" value="Male"> Male
					<input type="radio" name="empGen" value="Female"> Female
			
			PROJECT:
					<select name="empPrj">
						<option value="">-SELECT-</option>
						<option value="NIT">NIT</option>
						<option value="HTC">HTC</option>
						<option value="ORCL">ORCL</option>
					</select>
					
			ADDRESS:
					<textarea name="empAddr"></textarea>
					
			LANGUAGES:
					<input type="checkbox" name="empLangs" value="ENG"> ENG
					<input type="checkbox" name="empLangs" value="HIN"> HIN
					<input type="checkbox" name="empLangs" value="TEL"> TEL
					<input type="checkbox" name="empLangs" value="KAN"> KAN
					
			VENDORS:
				<select name="certificates" multiple>
					<option value="R-Com">R-Com</option>
					<option value="PEGGATE">PEGGATE</option>
					<option value="JONSON">JONSON</option>
					<option value="LandT">LandT</option>
				</select>
			<input type="submit" value="Create" />
		</pre>
	</form>
</body>
</html>