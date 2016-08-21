package ameenkhan07.recipes

// ABSTRACT CLASSES
// ABSTRACT CLASSES: cannot be instantiated, can be subclassed
// used to define properites, fields could be abstract or have concrete definitions
// ABSTRACT vs TRAITS

// Abstract Classes:
// val and var fields need to be redeclared in conccrete Classes
// Concrete val fields in in abstract classes

//ABSTRACT CLASS
abstract class Pet (name: String) {
	val greeting: String="Hello"
	var age: Int
	def sayHello() = { 
		println(greeting) 
	}
	def run 
	override def toString = s"I say $greeting, and I'm $age"
}


//CONCRETE CLASSES
class Dog2 (name: String) extends Pet (name) {
	override val greeting = "Woof"
	var age = 2
	def run { println("Dog is running") }
}

class Cat2 (name: String) extends Pet (name) {
	val greeting = "Meow"
	var age = 5
}