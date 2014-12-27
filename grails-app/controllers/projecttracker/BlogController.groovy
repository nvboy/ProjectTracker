package projecttracker

import projecttracker.BlogPost

class BlogController {

    //static scaffold = BlogPost

   // def beforeInterceptor = [action: this.&auth, except: ['show', 'about']]

    //def authService

   /* private auth() {
        if (!authService.authorizeScaffoldings(params.password) ) {
            response.status = 404
            return false
        }
    }
*/
	
    def show() {
        def id = params.id
        def blogPost = BlogPost.get(id)
        [blogPost: blogPost]
    }

    def editor() {
        if(params.id) {
          [blogPost: BlogPost.get(params.id)]
        }
    }

    def save() {
		//int k=1;
        def blogPost
        if (params.id) {
           blogPost = BlogPost.get(params.id)
        } else {
            blogPost = new BlogPost()
        }
		//def postLink = "/home/posts/${params}.id/"
        //blogPost.title = "<a href='$postLink'>${params}.title</a>"
		blogPost.title = params.title
        blogPost.htmlContent = params.htmlContent
		blogPost.postOrder=5
		blogPost.dateCreated=new Date()
		//k++
        blogPost.save(flush: true,failOnError:true)
		
		
        redirect(controller : 'listProjects', action: 'current', params: [id: blogPost.id])
    }

    def about() {}
}
