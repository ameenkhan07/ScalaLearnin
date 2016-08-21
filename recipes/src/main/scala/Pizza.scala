package ameenkhan07.recipes
// Auxillary Constructors
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
