package bit

import scala.io.Source

/**
  * Created by tpusers on 2017/2/11.
  */
object NumberOfOneBits {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next().toInt
    print(numbersOfOneBits(0, in))
  }
  def numbersOfOneBits(count: Int, num: Int): Int = {
    if (num == 0) count
    else numbersOfOneBits(count + num % 2, num / 2)
  }
}
