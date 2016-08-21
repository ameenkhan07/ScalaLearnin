// Write a class called "InnoString" that does the following:

// A private string variable
// A constructor that accepts a String value as input and sets it to the private variable
// An overridden toString() method that returns the string
// A concat method that concatenates a String to the private string variable
// An overloaded '+' operator that has the same functionality as the concat method
// An overloaded '==' operator that compares two InnoString objects for equivalence
// An isPalindrome method that returns true if the private string variable is a palindrome

class InnoString(s:String){
	private var str:String = s

	// // Auxiliary constructor
	// def this(s:String) = {
	// 	str = s
	// }

	override def toString(): String = { return str }

	def concat(s:String): String = {
		var x:String = s + " " + str
		x
	}

	def palindrome():Boolean = {
		var str2:String = str.reverse
		if(str2==str) return true
		else false
	}


}

object Mainer extends App{
	var obj = new InnoString("ameen")
	var obj2 = new InnoString("akka")
	println(obj.concat("rascal"))
	println(obj.palindrome())
	println(obj2.palindrome())
}