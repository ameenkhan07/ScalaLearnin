package ameenkhan07.recipes

// Constructors :Anything defined within the body of the class other than method dec‐
// larations is a part of the primary class constructor. Because auxiliary
// constructors must always call a previously defined constructor in the
// same class, auxiliary constructors will also execute the same code.

class Person(var firstName: String, val lastName: String) {
	
	private val HOME = System.getProperty("user.home")
	
	var age = 0
	
	// some methods
	override def toString = s"$firstName $lastName is $age years old"//overriding the `this` object getter

	def printHome() = { 
		println(s"HOME = $HOME") 
	}
	def printFullName() = { 
		println(this) 
	} // uses toString
}


