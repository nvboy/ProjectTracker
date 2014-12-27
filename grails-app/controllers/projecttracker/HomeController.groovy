package projecttracker

import projecttracker.BlogPost
//import mysite.Utils

class HomeController {

    def posts() {
        //list first 5 posts' snippet, with pagination for other posts
        def posts = BlogPost.findAll()
		posts.sort{it.dateCreated}
		posts=posts.reverse()
		
		
       // posts.sort{-it.postOrder}
    posts.each 
		{
			//def postLink = "/Blog/show/$it.id/"
			//it.title = "<a href='$postLink'>$it.title</a>"
          			
           def length = it.htmlContent.size()
            if (length > 310)
			{
			 
                //length = 310
            
            it.htmlContent = it.htmlContent.substring(0,310)+"\n...Continue reading"
			}
			
        }
		
        [posts: posts]
    }
}
