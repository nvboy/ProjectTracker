package projecttracker

class ListProjectsController {

	String currentUser
	def scaffold = true
    def index = { 
		redirect(action : 'signin')
		//render "Testing"
	}
	// def beforeInterceptor = [action: this.&auth, except: ['signin','tryagain','logout']]
	
	//def authService
	
	def auth() {
        if(!session.user) {
            redirect( action:"signin")
            //return false
        }
	}
	
	def authenticate()
	{
		def user =  ListProjects.findByNameAndDescription(params.name,params.description);
		if(user){
			session.user = user
			flash.message = "Hello ${user.fullName}!"
			redirect(action:"current")
			
		}else{
		flash.message = "Sorry, ${params.userName}. Please try again."
		redirect(action:"tryagain")
		}
	}
	
	def current()
	 {
		if(!session.userid)
		redirect(action:'signin')
		
		//String cn = currentUser
		
	}
	
	def cur1()
	{
		
	}
	
	
	def logout()
	{
		
		println "bye "+currentUser
		session.invalidate();
		//redirect(action : 'signin')
		
	}
	def cur2()
	{
		/*println params
		def lp = ListProjects.get(params.id)
		if (!lp) {
			println "No valid project found with id ${params.id}"
		
		} else
		{
			[project:lp]
		}*/
		
		def l1 =  ListProjects.findByName(params.name);
		if(l1)
		[project:l1]
		else
		render "No such name found"
		
		

		
	}
	
	def contact()
	{
		
	}
	
	def cur3() {
		if(request.method=="POST")
		{
			println params
			
			def l1 =  ListProjects.findByName(params.name);
			if(!l1)
			{
				l1=new ListProjects();
				l1.name=params.name
				l1.description=params.description
				l1.dueDate=new Date();
				l1.save()
				redirect(action:'cur6')
			}
			else
			{
				redirect(action:'already')
				//render "user exists"
			}
			
		}
	}
	
	def already()
	{
		
		
	}
	def cur4()
	{
		if(request.method=='POST')
		{
			def l1 =  ListProjects.findByNameAndDescription(params.name,params.description);
			println l1
			if(l1)
			{
				l1.delete(failOnError : true)
				redirect(action:'cur5')
			}
			else 
			redirect(action:'cur8')
		}
	}
	
	def cur5()
	{
		
	}
	def cur6()
	{
		
	}
	
	def cur7()
	{
		
		def l1 =  ListProjects.findAll()
		
			/*render '\n'
			render '<br>'
			render it.id+" \t " 
			render it.name+"  \t "
			render '\t'
			render it.description
			render '<br>'
			
			*/
			
			[project:l1]
			
		
		
	}
	
	def cur8()
	{
		
	}
	
	def fightclub()
	{
		
	}
	
	def cur9()
	{
		if(request.method=="POST")
		{
			println params
			if(params.name.equals(currentUser))
			{
				def l1 =  ListProjects.findByName(params.name);
				if(!l1)
				{
					l1=new ListProjects();
				}
				l1.name=params.name
				l1.description=params.description
				l1.dueDate=new Date();
				l1.save()
				redirect(action:'cur10')
			
			}
			else
			{
				redirect(action:'cur8')
			}
		}
	}
	def cur10()
	{}
	
	def signin()
	{
	
		
	}
	
	
	def profile()
	{
		//String cn = currentUser
		def l1 =  ListProjects.findByName(currentUser);
		if(l1)
		{
			
			//println currentUser+" profile"
			String cur = l1.name
			String des = l1.description
			String due = l1.dueDate
			[proname:cur, prodes:des, produe:due]
			
		}
		else
		render "No such name found"		
		

		
	}
	
	def validate()
	{
		println params
		def l1 =  ListProjects.findByNameAndDescription(params.name,params.description);
		println l1
		if(l1)
		{
			session.userid = l1.id 
			 currentUser=(params.name)
			println currentUser
			redirect(action:'current')
		
		}
		else
		
		redirect(action:'tryagain')
		
	}
	def tryagain()
	{
		
	}
}
