<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: black;
}

* {
	box-sizing: border-box;
}

/* Add padding to containers */
.container {
	padding: 16px;
	background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

/* Overwrite default styles of hr */
hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}
.resetbtn {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.registerbtn:hover {
	opacity: 1;
}
.resetbtn:

/* Add a blue text color to links */
a {
	color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
	background-color: #f1f1f1;
	text-align: center;
}
</style>
</head>
<body>

	<form action="/register.odc">
		<div class="container">
			<h1>Register</h1>
			<h2>Personal Info</h2>
			<p>Please fill in this form to create an account.</p>
			<hr>


			<label for="name"><b>Name</b></label> <input type="text"
				placeholder="Enter Name" name="name" id="name" required> <label
				for="mobile"><b>Mobile</b></label> <input type="number"
				placeholder="Enter MobileNumber" name="mobile" id="mobile" required>
			<br> <label for="Address"><b>Address</b></label> <input
				type="text" placeholder="Enter Address" name="Address" id="Address"
				required> <label for="state"><b>State</b></label> <input
				type="text" placeholder="Enter State" name="State" id="state"
				required> <label for="Email"><b>Email</b></label> <input
				type="text" placeholder="Enter Email" name="email" id="email"
				required>
			<hr>

			<h2>Visit Info</h2>
			<hr>
			<label for="Date"><b>Date</b></label> <input type="date" name="date" />
			<hr>
			<label for="peopleCount"><b>No of People</b></label> 
			<select id="No of people" name="No of people" >
			<c:forEach items="${noOfPersonList}" var="noOfpeople">
						<option value="${noOfpeople.value}">
							${noOfpeople.value}</option>
					</c:forEach>
					</select>
				 <br>
		 <label for="SpecialEntrance"><b>SpecialEntrance</b></label> <select
				id="SpecialEntrance" name="SpecialEntrance">
				<c:forEach var="selist" items="${specialEntryList}">
					<option value="${selist.value}">${selist.value}</option>
				</c:forEach>
			</select> <br>
			 <label><b>Select Prasada :</b> </label> <select name="PR"
				id="sel">
				<c:forEach var="prlist" items="${prasadaList}">
					<option value="${prlist.value}">${prlist.value}</option>
				</c:forEach>
			</select> <br> <label><b> ID Card : </b></label> <select name="ID"
				id="sel">
				<c:forEach var="idlist" items="${idList}">
					<option value="${idlist.value}">${idlist.value}</option>
				</c:forEach>
			</select> <br> <label><b>Select Pooja Type :</b> </label> <select
				name="PT" id="sel">
				<c:forEach var="ptlist" items="${poojaTypeList}">
					<option value="${ptlist.value}">${ptlist.value}</option>
				</c:forEach>
			</select>
			<hr>
			<p>
				By creating an account you agree to our <a href="#">Terms &
					Privacy</a>.
			</p>

			<button type="submit" class="registerbtn">Register</button>
			<button type="reset" value="cancel" class="resetbtn">Reset</button>

		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="#">Sign in</a>.
			</p>
	
     </div>
	</form>

</body>
</html>
