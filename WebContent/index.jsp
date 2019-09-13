<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/WEB-INF/indexStyle.css">
 <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

body{
	font-family: 'Roboto Condensed', sans-serif;
}

.loginWrapper {
    width: 90%;
    margin: 20px 8%;
}

.boxes {
    width: 25%;
    height: 400px;
    border: 1px solid black;
    float: left;

    margin-right: 110px;
}

.login1 {}

#loginalls{
	padding-top:  100px;
}

.loginall {
    /*position: absolute;*/
    left: -157%;
    top: 177%;
}

.group:before,
.group:after {
    content: "";
    display: table;
}

.group:after {
    clear: both;
}

.card {
    box-shadow: 0 -3px 17px 0 rgba(0, 0, 0, 1);
}

.column {
    float: left;
    width: 25%;

    margin-bottom: 16px;
    padding: 0 8px;

    margin-right: 59px;
    margin-left: 49px;
}

.container {
    background-color: #f2f2f2;
    font-family: Aller;
}

.button {
    border: none;
    border-radius: 4px;
    opacity: 100%;
    display: inline-block;
    padding: 8px;
    color: white;
    background-color: #243342;
    text-align: center;
    cursor: pointer;
    width: 21%;
    margin: 13px 148px;
}

.button:hover {
    background-color: #0BADF3FF;
}


.card img {
    padding: 10px;
        width: 90%;
    height: 86%;
}

#lableName {
    text-align: center;
    padding-top: 24px;
}

#img1 , #img2 , #img3 {
	width: 100px;
	height: 300px;
}


/*nav*/


#nav{
	    height: 63px;
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

#nav li a:hover:not(.active) {
  background-color: #09B;
}


.active {
  background-color: ;
}

#nav{
	    background-color: #243342;
	    position: sticky;
  		top: 0;
  }

/*  #item1 , #item2 , #item3 {
  	margin-left: 20px;

  }*/


/*footer*/


#item4{
	margin-left: 130px;
}


 .footer{
 	background-color: #243342;
 	height: 100px;
 }

 .listitems{
 	list-style: none;
 	display: inline-block;
 	padding: 5px;

 }

 .listitems img {
 	width: 30px;
 	height: 30px;
 }

 .listitemswrapper{
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

.listLetters li{
	display: inline-block;
	list-style: none;
	padding-left: 21px;

}

.listLetters{
	position: relative;
    top: 6px;
    left: 514px;
}


.listitems2 a{
	color: white;
	text-decoration: none;
	font-family: 'Roboto Condensed', sans-serif;
}


a{
  color: white;
  text-decoration: none;
}


</style>

</head>
<body>
<div class="welcome">
    	<img src="Pictures/welcome.png" width="100%" height="350px">
    </div>
    <div id="nav">
        <ul>
            <li id="item1" style="float:right" class="active"><a href="#home">Home</a></li>
            <li id="item2"><a href="#news">Register</a></li>
            <li id="item3"><a href="#contact">Contact Us</a></li>
            <li id="item4" ><a  href="#about">About</a></li>
        </ul>
    </div>


    <div id="loginalls" class="loginall group">
        <div class="column">
            <div class="card">
                <img id="img1" src="Pictures/kisspng-pre-school-student-child-care-happy-indian-family-5b39c4e797fe26.8596397615305126156226.png" alt="Student" style="width:100%">
                <div class="container">
                    <h2 id="lableName">Student</h2>
                    <P><button class="button"><a href="studentLogin.jsp">Login</a></button></p>
                </div>
            </div>
        </div>
        <div class="column">
            <div class="card">
                <img id="img2" src="Pictures/class.svg" alt="Teacher" style="width:100%">
                <div class="container">
                    <h2 id="lableName">Teacher</h2>
                    <P><button class="button"><a href="teacherLogin.jsp">Login</a></button></p>
                </div>
            </div>
        </div>
        <div class="column">
            <div class="card">
                <img id="img3" src="Pictures/admin-with-cogwheels.svg" alt="Admin" style="width:100%">
                <div class="container">
                    <h2 id="lableName">Admin</h2>
                    <P><button class="button"><a href="adminLogin.jsp">Login</a></button></p>
                </div>
            </div>
        </div>
    </div>

    <div class="footer">
    	<div class="listitemswrapper">
    	<ul class="listMain">
    		<li class="listitems"><img src="Pictures/fb.png"></li>
    		<li class="listitems" ><img src="Pictures/instagram.png"></li>
    		<li class="listitems"><img src="Pictures/linkedin.png"></li>
    		<li class="listitems"><img src="Pictures/twitter.png"></li>
    		<li class="listitems"><img src="Pictures//youtube.png"></li>
    		
    	</ul>
    	</div>

    	<p class="reserved">Copyright © 2019 School Design & Develop by blank.lk All Rights Reserved.</p>

    	<ul class="listLetters">
    		<li class="listitems2"><a href="">Home</a></li>
    		<li class="listitems2"><a href="">Register</a></li>
    		<li class="listitems2"><a href="">Contact</a></li>
    		<li class="listitems2"><a href="">About</a></li>
    	</ul>
    </div>
    
</body>
</html>