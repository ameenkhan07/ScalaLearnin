package ameenkhan07.recipes
//
// 1. Primary Constructors
//


class Person(var firstName: String, var lastName: String) {
	
	println("still in the constructor")

	private val HOME = System.getProperty("user.home")
	
	var age = 0
	
	// some methods
	override def toString = s"$firstName $lastName is $age years old"
	def printHome() = { 
		println(s"HOME = $HOME") 
	}
	def printFullName() = { 
		println(this) 
	} // uses toString
	
	printHome
	printFullName
	println("still in the constructor")
}


object HelloWorld extends App {
	val p = new Person("Adam", "Meyer")
	println("Hello ameenkhan07.Recipes!")
}
