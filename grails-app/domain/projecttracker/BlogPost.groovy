package projecttracker

/**
 * Created by vignes on 23-Dec-14.
 */
class BlogPost {
	//def text = column[String]("text", O.DBType("VARCHAR(20000)"))
    String title;
    String htmlContent
    Integer postOrder
	Date dateCreated
    boolean published = true

    static mapping = {
        htmlContent type:'text'
		//title type:'text'
        postOrder defaultValue:'0'
        published defaultValue: true
    }

    String toString() {
        return title
    }

    static constraints = {
        title()
        postOrder()
        htmlContent display: false
    }

   /* def beforeInsert() {
        def maxPlanOrder = BlogPost.createCriteria().get {
            projections {
                max "postOrder"
            }
        } as Integer
        this.postOrder = maxPlanOrder + 1
    }*/
}