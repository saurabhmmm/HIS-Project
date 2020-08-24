<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
</head>
<body>
	<h1>Create Account</h1>
	<form action="/createAccount" method="post">
		<table style="with: 50%">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><select name="role">
						<option value="Case Worker">Case Worker</option>
						<option value="Admin">Admin</option>

					</select>
				</td>
			</tr>
			
		</table>
		<input type="submit" value="Submit" />
	</form>

</body>
</html>