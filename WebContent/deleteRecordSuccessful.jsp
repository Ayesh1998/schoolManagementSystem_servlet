<title>Insert title here</title>

<style>

/*nav*/
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

/*form*/
.formWrapper {
	width:40%;
	height: 800px;
}

#input1 {
	display: block;
	width: 75%;
	margin: 10px;
	border: 1px solid lightgrey;
	border-radius: 5px;
	padding: 4px;
	padding-left: 11px;
	margin-left: 60px;
}

label {
	display: block;
}

form {
	border: 2px solid #243342;
	position: relative;
	top: 116px;
	left: 450px;
	z-index: 0;
	border-radius: 13px;
	box-shadow: 0 0px 7px 0 rgba(0, 0, 0, 0.5);
}

form p {
	padding: 10px;
	position: relative;
	left: 217px;
	font-size: 20px;
}


.buttons {
	position: relative;
	margin: 23px;
	left: 56px;
	margin-top: 43px;
}

.buutonss {
	margin-left: 189px;
	border-radius: 3px;
	background-color: #243342;
	color: white;
	border: 0px;
	padding: 9px;
	padding-left: 20px;
	padding-right: 20px;
}

.buutonss:hover {
	background-color: #09B;
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
	margin-top: 30px;
}

.footer p {
	top: 73px;
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
	top: 6px;
	left: 514px;
}

.listitems2 a {
	color: white;
	text-decoration: none;
	font-family: 'Roboto Condensed', sans-serif;
}
</style>

<script type="text/javascript">

alert("Record Delete Successful");

</script>

</head>
<body>

	<div id="nav">
		<ul>
			<li id="item1" style="float: right" class="active">
			<a href="#home">Home</a></li>
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


	
	<div class="formWrapper">


		<form action="ModifyExamTimeTableServlet" method="post">
			<p></p>
			<input type="text" name="sub1" placeholder="Enter Subject" id="input1">
			<input type="text" name="class1" placeholder="Enter Stuent's Class" id="input1">
		
            <input type="submit" name="button" value="Delete_Record" class="buutonss" style="padding-left: 29px; padding-right: 29px;">
			
			
			<p></p>
			<input type="text" name="sub2" placeholder="Enter Subject" id="input1">
			<input type="text" name="class2" placeholder="Enter Stuent's Class" id="input1">
			<input type="text" name="time" placeholder="Enter Time"id="input1">
			
            <input type="submit" name="button" value="Update_Time" class="buutonss" style="padding-left: 29px; padding-right: 29px;">
			
			
			<p></p>
			<input type="text" name="sub3" placeholder="Enter Subject" id="input1">
			<input type="text" name="class3" placeholder="Enter Stuent's Class" id="input1">
			<input type="text" name="loc" placeholder="Enter Location" id="input1"> 
			
            <input type="submit" name="button" value="Update_Location" class="buutonss" style="padding-left: 29px; padding-right: 29px;"><br/><br/>
		
			
			
		</form>
	</div>

	<div class="footer">
		<div class="listitemswrapper">
			<ul class="listMain">
				<li class="listitems"><img src="Pictures/fb.png"></li>
				<li class="listitems"><img src="Pictures/instagram.png"></li>
				<li class="listitems"><img src="Pictures/linkedin.png"></li>
				<li class="listitems"><img src="Pictures/twitter.png"></li>
				<li class="listitems"><img src="Pictures/youtube.png"></li>

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