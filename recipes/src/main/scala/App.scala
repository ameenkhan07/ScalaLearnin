package ameenkhan07.recipes
//
// 1. Constructors :Anything defined within the body of the class other than method dec‐
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

// 2. Auxillary Constructors
// Auxiliary constructors are defined by creating methods named 'this' .
// Each auxiliary constructor must begin with a call to a previously defined construc‐
// tor.
// Each constructor must have a different signature.
// One constructor calls another, previosuly defined, constructor with the name this .

// primary constructor
class Pizza (var crustSize: Int, var crustType: String) {
	// one-arg auxiliary constructor
	def this(crustSize: Int) {
		this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
	}
	// one-arg auxiliary constructor
	def this(crustType: String) {
		this(Pizza.DEFAULT_CRUST_SIZE, crustType)
	}
	// zero-arg auxiliary constructor
	def this() {
		this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
	}
	override def toString = s"A $crustSize inch pizza with a $crustType crust"
}

// Companion Object : Static values and methods like in Java/C++
object Pizza {
	val DEFAULT_CRUST_SIZE = 12
	val DEFAULT_CRUST_TYPE = "THIN"
}

class Foo {
	// set 'text' equal to the result of the block of code
	val text = {
		var lines = ""
		try {
			lines = io.Source.fromFile("/etc/passwd").getLines.mkString
		} 
		catch {
			case e: Exception => lines = "Error happened"
		}
		lines
	}
	println(text)
}

object HelloWorld extends App {
	
	val p = new Person("Randal", "Rudolph")
	p.printHome
	p.printFullName
	println(p.firstName)
	println(p.lastName)

	val  p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
	val  p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
	val  p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
	println(p1)
	println(p2)
	println(p3)

	lazy val f = new Foo
	f
}

