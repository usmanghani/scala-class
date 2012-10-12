package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = if (r == c || r == 0 || c == 0) 1 else pascal(r - 1, c - 1) + pascal(r - 1, c)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def balanceIter(chars: List[Char], stack: List[Char]): Boolean = {

      if (chars.isEmpty && !stack.isEmpty)

        false

      else if (chars.isEmpty && stack.isEmpty)

        true

      else if (chars.head == '(')

        balanceIter(chars.tail, "(".toList ::: stack)

      else if ((chars.head == ')') && stack.isEmpty)

        false

      else if ((chars.head == ')') && (stack.head == '('))

        balanceIter(chars.tail, stack.tail)

      else

        balanceIter(chars.tail, stack)

    }

    balanceIter(chars, "".toList)

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
