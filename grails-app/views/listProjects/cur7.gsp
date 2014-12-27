<html>

<!--- Basic Page Needs
   ================================================== -->
   <meta charset="utf-8">
	<title>My First Grails</title>
	<meta name="description" content="">
	<meta name="author" content="">

   <!-- Mobile Specific Metas
   ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- CSS
    ================================================== -->
   <link rel="stylesheet" href="/css/default.css">
	<link rel="stylesheet" href="/css/layout.css">
   <link rel="stylesheet" href="/css/media-queries.css">    

   <!-- Script
   ================================================== -->
	<script src="/js/modernizr.js"></script>

   <!-- Favicons
	================================================== -->
	<link rel="shortcut icon" href="favicon.png" >
	   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
   <script>window.jQuery || document.write('<script src="js/jquery-1.10.2.min.js"><\/script>')</script>
   <script type="text/javascript" src="js/jquery-migrate-1.2.1.min.js"></script>

	<script src="http://maps.google.com/maps/api/js?sensor=true" type="text/javascript"></script>
   <script src="/js/gmaps.js"></script>
   <script src="/js/waypoints.js"></script>
   <script src="/js/jquery.countdown.js"></script>
   <script src="/js/jquery.placeholder.js"></script>
   <script src="/js/backstretch.js"></script>  
   <script src="/js/init.js"></script>


<dev id="display1">
<title>

User Information
</title>
</dev>

<head>







	<nav id="nav-wrap">

		      <a class="menu-btn" href="#nav-wrap" title="Show navigation">Show navigation</a>
			   <a class="menu-btn" href="#" title="Hide navigation">Hide navigation</a>

		      <ul id="nav" class="nav">
		         <li class="current"><a class="smoothscroll" href="/listProjects/current">Home</a></li>

			      <li><a class="smoothscroll" href="/listProjects/cur1">Eltropy</a></li>
		      </ul> <!-- end #nav -->

		   </nav> <!-- end #nav-wrap --> 	        
        
	

      
   
</head>
<body>

<h1>
<center>
<u>
<br><br>
User Information
</u>
</center>
</h1>

<div id="display">

	<table style="border:3px solid olive" style="width:100%;">
 	<table style="width:100%;">
 	<tr style="background-color:white;">
    <th>ID</th>
    <th>UserName</th> 
    <th>Description</th>
    <th>Due Date</th>
  </tr>
  <tr>&nbsp;</tr>	<br>
 	<br></br>
 	<g:each in="${project}"  var="pr">
 	
 	
  <tr>
    <td>${pr.id}</td>
    <td><a href="/listProjects/cur2?name=${pr.name}">${pr.name}</a></td> 
    <td>${pr.description}</td>
    <td>${pr.dueDate}</td>
  </tr>
 </g:each>
</table>
 	
	



<br><br><br><br>

 		
		

</div>
</body>


</html>