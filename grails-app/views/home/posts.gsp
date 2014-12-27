<html>
<title>
Posts
</title>

<head>

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





	<nav id="nav-wrap">

		      <a class="menu-btn" href="#nav-wrap" title="Show navigation">Show navigation</a>
			   <a class="menu-btn" href="#" title="Hide navigation">Hide navigation</a>

		      <ul id="nav" class="nav">
		         <li class="current"><a class="smoothscroll" href="/listProjects/current">Home</a></li>
					<li><a class="smoothscroll" href="/blog/editor">New Post</a></li>
		      
			      <li><a class="smoothscroll" href="/listProjects/cur1">Eltropy</a></li>
		      </ul> <!-- end #nav -->

		   </nav> <!-- end #nav-wrap --> 	        
        
	<audio src="/sons.mp3" controls loop="infinite">
<p>If you are reading this, it is because your browser does not support the audio element.</p>
</audio>

      
   
</head>


<h1>
<center>
<u>
<br><br>
NewsFeed.
<br>
</u>
</center>
</h1>


 

 <center>
 <form action="/blog/editor">
Feel like sharing something ?<br> <input type="submit" value="NEW POST">
</form>
 </center>





<body>

	

<div id="content-wrap">
    <div class="row">
        <div id="main" class="nine columns">
            <g:each var="post" in="${posts}">
                <div class="post-snippet">
                	<div align="left">
                	 <h1><u>
                        ${raw(post.title)} 
                        <br>
                        
                        
                    </u></h1>
                    <p>
                    	${raw(post.dateCreated)}
                 
                    	<br><br>
                        ${raw(post.htmlContent)}
                    </p>
                    <br><br>
                    <a href='/Blog/show/${raw(post.id)}/'>View Post</a>
                    <br><br>
                    
                    
                    
                    <br>
                    </div>
                   
                </div>
            </g:each>
        </div>
       
    </div>
</div>
</body>
</html>