package ameenkhan07.recipes

object Main extends App {

//Person..scala	
	// val p = Person("alvinalexander", "secret")
	// p.address = Some(Address("Talkeetna", "AK", "99676"))
	// p.firstName = "Randall"
	// p.lastName = "Drakaris"

	// println(p.firstName)
	// println(p.lastName)
	// println(p)
	// p.address.foreach { a =>
	// 	println(a.city)
	// 	println(a.state)
	// 	println(a.zip)
	// }

	val teresa = new Employee("Teresa", "secret",Address("Louisville", "KY","110025"), 25)
	println(teresa)

//Pizza.scala
	val  p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
	val  p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
	val  p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
	println(p1)
	println(p2)
	println(p3)

// Foo.scala
	lazy val f = new Foo


//Pet.scala
	val dog = new Dog2("Fido")
	val cat = new Cat2("Morris")
	dog.sayHello
	cat.sayHello
	println(dog)
	println(cat)
	cat.age = 10
	println(cat)


//Humans.scala
	val c = new Child
	println(s"c.printSuper = ${c.printSuper}")
	println(s"c.printMother = ${c.printMother}")
	println(s"c.printFather = ${c.printFather}")
	println(s"c.printHuman = ${c.printHuman}")

}

