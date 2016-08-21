package ameenkhan07.recipes

// ABSTRACT CLASSES
// ABSTRACT CLASSES: cannot be instantiated, can be subclassed
// used to define properites, fields could be abstract or have concrete definitions
// ABSTRACT vs TRAITS


//ABSTRACT CLASS
abstract class Pet (name: String) {
	val greeting: String
	var age: Int
	def sayHello() = { 
		println(greeting) 
	}
	override def toString = s"I say $greeting, and I'm $age"
}


//CONCRETE CLASSES
class Dog2 (name: String) extends Pet (name) {
	val greeting = "Woof"
	var age = 2
}

class Cat2 (name: String) extends Pet (name) {
	val greeting = "Meow"
	var age = 5
}