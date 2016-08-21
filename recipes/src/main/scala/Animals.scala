package ameenkhan07.recipes

//Inheritance:

// You can control the superclass constructor that’s called by the primary constructor in a subclass,
// but you can’t control the superclass constructor that’s called by an auxiliary constructor in the
// subclass.
// You control the superclass constructor that’s called by its primary constructor when you 
// define the extends portion of the subclass declaration.

class Animal (var name: String, var age: Integer) {
	// ...
	def this (name: String) {
		this(name, 0)
	}
	override def toString = s"$name is $age years old"
}


class Dog (name: String) extends Animal (name) {
	println("Dog constructor called")
}