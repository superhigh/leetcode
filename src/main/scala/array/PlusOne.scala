package array

import scala.io.Source

/**
  * Created by tpusers on 2017/2/9.
  */
object PlusOne {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin
    val in = s.getLines.next.toArray.map(_.toInt - 48)
    val out = plusOne(in)
    for (o <- out)
      print(o)

  }
  def plusOne(digits: Array[Int]): Array[Int] = {
    var i = digits.length - 1
    while (i >= 0){
      if (digits(i) < 9) {
        digits(i) += 1
        return digits
      }
      digits(i) = 0
      i -= 1
    }
    1 +: digits
  }
}
