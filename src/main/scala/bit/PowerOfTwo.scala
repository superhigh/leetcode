package bit

import scala.io.Source

/**
  * Created by tpusers on 2017/2/11.
  */
object PowerOfTwo {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next().toInt
    print(isPowerOfTwo(in))
  }
  def isPowerOfTwo(num: Int): Boolean = {
    if (num < 0) false
    else if (num == 0) true
    else {
      var tmp = num
      while (tmp > 2){
        if (tmp % 2 != 0) return false
        tmp = tmp / 2
      }
      true
    }
  }
}
