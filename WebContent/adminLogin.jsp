<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed"
	rel="stylesheet">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	width: 80%;
}

.footer {
	background-color: #243342;
	height: 100px;
}

.listitems {
	list-style: none;
	display: inline-block;
	padding: 5px;
}

.listitems img {
	width: 30px;
	height: 30px;
}

.listitemswrapper {
	float: right;
	margin-right: 100px;
	/* margin-top: 30px; */
	position: relative;
	top: 30px;
}

.footer p {
	top: 70px;
	font-family: 'Roboto Condensed', sans-serif;
	position: relative;
	left: 470px;
	color: #E0E0E0FF;
}

.listLetters li {
	display: inline-block;
	list-style: none;
	padding-left: 21px;
}

.listLetters {
	position: relative;
	top: 2px;
	left: 514px;
}

.listitems2 a {
	color: white;
	text-decoration: none;
	font-family: 'Roboto Condensed', sans-serif;
}

.contact-main {
	clear: both;
	content: "";
}

#nav {
	height: 63px;
	z-index: 1;
}

#nav ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #243342;
	display: inline-flex;
	margin-left: 60%;
}

#nav li {
	float: left;
}

#nav li a {
	display: block;
	color: white;
	text-align: center;
	padding: 22px 24px;
	text-decoration: none;
}

#nav li a:hover:not (.active ) {
	background-color: #09B;
}

.active {
	background-color:;
}

#nav {
	background-color: #243342;
	position: sticky;
	top: 0;
}

/*
  #item1 , #item2 , #item3 {
    margin-left: 20px;

  }*/
#item4 {
	margin-left: 130px;
}

input[type=text], input[type=password] {
	width: 75%;
	padding: 12px 20px;
	margin: 15px 75px;
	display: inline-block;
	border: 2px solid #ced8e3;
	box-sizing: border-box;
	border-radius: 10px;
}

button {
	background-color: #2e3e52;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

button:hover {
	background-color: #09B;
}

.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

img.avatar {
	width: 40%;
	border-radius: 50%;
	margin-left: 80px;
}

.container {
	padding: 16px;
	border-radius: 20px;
}

span.psw {
	float: right;
	padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 200px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
	.formMain {
		width: 43%; # buttons { margin-left : 193px;
		width: 112px;
		border-radius: 5px;
	}
	#container {
		border-radius: 5px;
	}
	.boader1 {
		display: inline-block;
		box-sizing: border-box;
		position: absolute;
	}
	.main {
		
	}
}
</style>
</head>

<body>
	<div id="nav">
		<ul>
			<li id="item1" style="float: right" class="active"><a
				href="#home">Home</a></li>
			<li id="item2"><a href="#news">Register</a></li>
			<li id="item3"><a href="#contact">Contact Us</a></li>
			<li id="item4"><a href="#about">About</a></li>
			<li><a href="#about"><form action="Logout" method="post">
             	<input type="submit" value="Log Out" style="    background-color: #243342;
    color: white;
    border: 0px solid white;" >
             </form></a></li>
		</ul>
	</div>
	<div class="main">
		<div class="boader1"
			style="border: 45px solid #ced8e3; width: 61%; left: 260px; position: relative; height: 482px; top: 70px;">
			<div class="boader2"
				style="border: 34px solid #8da3bf; height: 415px;">
				<div class="boader3"
					style="border: 28px solid #496383; height: 358px;">
					<div class="boader4"
						style="border: 20px solid #2e3e52; height: 318px">
						<div class="formMain">
							<p
								style="position: relative; top: 23px; left: 39%; font-size: 28px; padding: 0px; margin: 0px; color: #232f3e; font-family: 'Roboto Condensed', sans-serif;">Admin
								Login</p>
							<form action="logAdmin" style="width: 80%;" method="post">
								<div class="container"
									style="position: relative; left: 203px; top: 27px;">
									<img src="Pictures/admin-with-cogwheels.svg"
										style="position: absolute; top: 31px; width: 114px; left: -119px;">
									<input type="text" placeholder="Enter Username" name="name"
										required> <input type="password"
										placeholder="Enter Password" name="psw" required>
									<button type="submit"
										style="margin-left: 81px; width: 112px; border-radius: 5px; font-size: 20px;">Login</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer" style="position: relative; top: 150px;">
		<div class="listitemswrapper">
			<ul class="listMain">
				<li class="listitems"><img src="Icons/fb.png"></li>
				<li class="listitems"><img src="Icons/instagram.png"></li>
				<li class="listitems"><img src="Icons/linkedin.png"></li>
				<li class="listitems"><img src="Icons/twitter.png"></li>
				<li class="listitems"><img src="Icons/youtube.png"></li>
			</ul>
		</div>
		<p class="reserved">Copyright © 2019 School Design & Develop by
			blank.lk All Rights Reserved.</p>
		<ul class="listLetters">
			<li class="listitems2"><a href="">Home</a></li>
			<li class="listitems2"><a href="">Register</a></li>
			<li class="listitems2"><a href="">Contact</a></li>
			<li class="listitems2"><a href="">About</a></li>
		</ul>
	</div>

</body>
</html>