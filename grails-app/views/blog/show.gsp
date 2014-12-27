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

Post
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
<div id="content-wrap">
    <div class="row">
        <div id="main" class="nine columns">
            <section class="page">
                <h2>
                    ${raw(blogPost.title)}
                </h2>
                <p>
                    ${raw(blogPost.htmlContent)}
                </p>
            </section>
        </div>
        
        <br><br><br>
         <div id="disqus_thread"></div>
    <script type="text/javascript">
        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
        var disqus_shortname = 'nvboy'; // required: replace example with your forum shortname

        /* * * DON'T EDIT BELOW THIS LINE * * */
        (function() {
            var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
            dsq.src = '//' + disqus_shortname + '.disqus.com/embed.js';
            (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
        })();
    </script>
    <noscript>Please enable JavaScript to view the <a href="http://disqus.com/?ref_noscript">comments powered by Disqus.</a></noscript>
        <!--
        <div id="sidebar" class="three columns">
            <div class="widget widget_categories">
                <h3>Categories</h3>
                <ul>
                    <li><a href="#" title="">Google</a> (1)</li>
                    <li><a href="#" title="">Salesforce</a> (0)</li>
                </ul>
            </div>
        </div>
        -->
    </div>
</div>
</body>
