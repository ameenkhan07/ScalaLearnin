package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    balance("(if (zero? x) max (/ 1 x))".toList)
    countChange(4,List(1,2))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c==0||r==c) 1 
    else if(r<c) 0
    else pascal(c-1,r-1)+pascal(c,r-1)
  }
  
 /**
   * Exercise 2
   */

  def balance(listy: List[Char]): Boolean = {

    //utility recursive function
    def balancer(count: Int, listy: List[Char]): Boolean = {
      
      if (listy.isEmpty) { 
        if (count == 0) true 
        else false 
      }
      
      else if (count < 0) false
      else if (listy.head == '(') balancer(count+1, listy.tail)
      else if (listy.head == ')') balancer(count-1, listy.tail)
      else balancer(count, listy.tail)
    
    }
    balancer(0, listy)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    if (money < 0) 0
    else if (money == 0) 1
    else if (coins.isEmpty) 0 
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  
  }
}