<!DOCTYPE html>
<html>

<head>
    
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

.list {
    padding-top:  100px;
    text-align: center;
}

.card {
    border: 1px solid dimgray;
}

.column {
    display: inline-block;
    width: calc(50% - 32px);
    margin: 63px;
}

@media only screen and (min-width: 768px) {
    .column {
        width: calc(25% - 32px);
    }
}

.container {
    font-family: Aller;
}

.card p {
    box-sizing: border-box;
    text-align: right;
    padding: 0 10px;
}

.card button {
    border: none;
    border-radius: 4px;
    opacity: 100%;
    min-width: 50px;
    display: inline-block;
    padding: 8px;
    color: white;
    background-color: #243342;
    text-align: center;
    cursor: pointer;
    width: 21%;
}

.card button:hover {
    background-color: #0BADF3FF;
}


.card img {
    box-sizing: border-box;
    padding: 24px;
    width: 100%;
	height: 100%;
}

#lableName {
    text-align: center;
    padding-top: 24px;
}

.nav ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;

}

.nav li {
  display: inline-block;
}

.nav li a {
    display: block;
    color: white;
    text-align: center;
    padding: 22px 24px;
    text-decoration: none;
}

.nav li a:hover:not(.active) {
  background-color: #09B;
}

.nav{
    width: 100%;
    display: inline-flex;
    flex-direction: row-reverse;
    background-color: #243342;
    position: sticky;
    top: 0;
}

 .footer{
 	background-color: #243342;
 }

 .footer .nav {
     background-color: transparent;
 }

 .footer .icon li {
    list-style: none;
    display: inline-block;
    padding: 5px;
}

.footer .icon img {
 	width: 30px;
 	height: 30px;
 }

 .footer .icon {
    width: 100%;
    display: inline-flex;
    flex-direction: row-reverse;
}

.footer .icon ul {
    margin: 15px;
}

.footer p {
    text-align: right;
    margin: 15px;
    font-family: 'Roboto Condensed', sans-serif;
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

.table-condensed th, .table-condensed td{
        width : 200px;
     border: 1px solid #ddd;
  padding: 8px;
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

/*form*/
.formWrapper {
    width: 40%;
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

input{
    margin: 7px;
    padding: 6px;
    background-color: #243342;
    color:white;
    border:0px solid white;
    border-radius: 2px;

}

form p {
    padding: 10px;
    position: relative;
    left: 217px;
    font-size: 20px;
}

.genders {
    top: -17px;
    position: relative;
    left: 280px;
    padding: 0px;
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
    left: -195px;
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

a{

    color:white;
    text-decoration: none;
}

.card {
    box-shadow: 0 -3px 17px 0 rgba(0, 0, 0, 1);
}
    
   </style> 
    
    
    <title></title>
<!--    <link rel="stylesheet" type="text/css" href="home.css">-->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
</head>
    


<body>
    <div class="nav">
        <ul>
            <li class="active"><a href="#home">Home</a></li>
            <li><a href="#news">Register</a></li>
            <li><a href="#contact">Contact Us</a></li>
            <li><a href="#about">About</a></li>
           
              <li><a href="#about"><form action="Logout" method="post">
             	<input type="submit" value="Log Out" style="    background-color: #243342;
    color: white;
    border: 0px solid white;" >
             </form></a></li>
             
        </ul>
    </div>


    <div class="list">
        <div class="column">
            <div class="card">
                <img src="Pictures/search_document-512.png" alt="Student" style="width:100%">
                <div class="container">
                    <h2 id="lableName">Time Table</h2>
                     <form action="studentDisplayTimetableServlet" method="post">
                    
                    <input type="submit" value="View" class=>
                    
                    </form>
                </div>
            </div>
        </div><div class="column">
            <div class="card">
                <img src="Pictures/black-and-white-school-timetable-theme-1-picture-illustration-GEPP04.jpg" alt="Teacher" style="width:100%;height: 338px;">
                <div class="container">
                    <h2 id="lableName">Exam Timetable</h2>
                    
                    <form action="StudentDisplayExamTimeTableServlet" method="post">
                    
                     <input type="submit" value="View" >
                    
                    </form>
                    
                </div>
            </div>
        </div><div class="column">
            <div class="card">
                <img src="Pictures/download.png" alt="Time Table" style="width:100%;     height: 338px;
">
                <div class="container">
                    <h2 id="lableName">Profile</h2>
                   <form action="StudentShowProfileServlet" method="post">
                    
                     <input type="submit" value="View" >
                    
                    </form>
                </div>
            </div>
        </div>
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

        <p class="reserved" style="">Copyright © 2019 School Design & Develop by
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