package ameenkhan07.recipes


trait Human {
	def hello = "the Human trait"
}

trait Mother extends Human {
	override def hello = "Mother"
}
trait Father extends Human {
	override def hello = "Father"
}

Child extends Human with Mother with Father {
	printSuper = super.hello
	printMother = super[Mother].hello
	printFather = super[Father].hello
	printHuman = super[Human].hello
}

