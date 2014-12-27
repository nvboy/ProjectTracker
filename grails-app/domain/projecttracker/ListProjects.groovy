package projecttracker

class ListProjects {

	String name
	String description		//password :P
	Date dueDate
	//String currentUser
	
    static constraints = {
		name(blank : false)
		description(password : true)
    }
}
