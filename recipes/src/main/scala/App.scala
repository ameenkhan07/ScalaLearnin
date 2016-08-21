package ameenkhan07.recipes

object Main extends App {
	
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

	val  p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
	val  p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
	val  p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
	println(p1)
	println(p2)
	println(p3)

	lazy val f = new Foo
}

