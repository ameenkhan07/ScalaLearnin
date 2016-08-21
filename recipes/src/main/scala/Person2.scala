package ameenkhan07.recipes


//Inheritance
// Theres no direct way to control which superclass constructor is called from
// an auxiliary constructor in a subclass. In fact, because each auxiliary constructor must
// call a previously defined constructor in the same class, all auxiliary constructors will
// eventually call the same superclass constructor that’s called from the subclass’s primary
// constructor.
case class Address2 (city: String, state: String)

case class Role2 (role: String)

class Person2 (var name: String, var address: Address) {
	// no way for Employee auxiliary constructors to call this constructor
	def this (name: String) {
		this(name, null)
		address = null
	}
	override def toString = if (address == null) name else s"$name @ $address"
}

class Employee2 (name: String, role: Role, address: Address) extends Person2 (name, address) {

	def this (name: String) {
	this(name, null, null)
	}
	def this (name: String, role: Role) {
		this(name, role, null)
	}
	def this (name: String, address: Address) {
		this(name, null, address)
	}
}