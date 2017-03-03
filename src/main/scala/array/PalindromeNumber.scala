package array

import scala.io.Source

/**
  * Created by tpusers on 2017/2/10.
  */
object PalindromeNumber {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next().toInt
    print(palindromeNumber(in))
  }
  def palindromeNumber(num: Int): Boolean = {
    if (num < 0) false
    else if (num == 0) true
    else {
      var x = num
      var num2 = 0
      while (x > 0){
        num2 = num2 * 10 + x % 10
        x = x / 10
      }
      num2 == num
    }
  }
}
