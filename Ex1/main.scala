// Build an Object called "Factorial" and write a method in it to compute the factorial of any integer from 1 until 100
// (Note: the method must compute the factorial iteratively)
//   - The program must be invoked from the command-line with the integer as a command-line parameter
//   - The program must print a message and exit with a status of 1 when a command-line parameter is missing
//   - The class must raise an "FactorialInputOutOfRange" Exception when the input is < 1 or > 100
//   - Print the output using string interpolation
//   - BONUS: Create a recursive version of the factorial method


object Factorial extends App {

	// Iterative Factorial
	def computeFactorial(x:Int): Int ={
		var factorial = 1;
		var a = 0;
		for(a <- 1 to x ){
			factorial=factorial*a;
		}
		return factorial;
	}

	// Recursive Factorial
	def recursiveFactorial(x:Int): Int ={
		if (x==0) {
			return 1;
		}
		return(x*recursiveFactorial(x-1))
	}

	// Argument
	val arg0 = args.headOption.getOrElse {
	Console.err.println("Need an argument")
	sys.exit(1)
	}


	println("RECURSIVE METHOD : The factorial of "+arg0+" is "+recursiveFactorial(arg0.toInt));

	try {
		// computeFactorial(arg0.toInt)
		println("ITERATIVE METHOD : The factorial of "+arg0+" is "+computeFactorial(arg0.toInt));
	  // ...
	} catch {
	  case e: FactorialInputOutOfRange => 	println"FactorialInputOutOfRange"
	}
}