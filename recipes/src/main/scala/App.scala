package ameenkhan07.recipes

object Main extends App {
	
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
}

