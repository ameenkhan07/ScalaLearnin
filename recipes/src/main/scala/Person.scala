package ameenkhan07.recipes

// Constructors :Anything defined within the body of the class other than method dec‐
// larations is a part of the primary class constructor. Because auxiliary
// constructors must always call a previously defined constructor in the
// same class, auxiliary constructors will also execute the same code.

case class Person(var username: String, var password: String) {
	
	private val HOME = System.getProperty("user.home")

	var firstName = ""
	var lastName = ""
	var address = None: Option[Address]
	var age = 0
	
	var add = address.foreach { a =>
		println(a.city)
		println(a.state)
		println(a.zip)
	}

	override def toString = if (address == null) username else s"$firstName @ $add"
	// override def toString = s"$firstName $lastName is $age years old"//overriding the `this` object getter

	def printHome() = { 
		println(s"HOME = $HOME") 
	}

	def printFullName() = { 
		println(this) 
	} // uses toString
}


case class Address(city: String, state: String, zip: String) {

	override def toString = s"Address :\n$city \n$state \n$zip"

}