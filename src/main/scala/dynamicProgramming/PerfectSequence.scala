package dynamicProgramming

import scala.io.Source

/**
  * Created by tpusers on 2017/2/13.
  */
object PerfectSequence {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val num = s.next().toInt
    print(perfectSequence(num))
  }
  def perfectSequence(num: Int) = {
    val f = new Array[Int](num + 1)
    f(0) = 0
    f(1) = 1
    var i = 2
    while (i <= num){
      var tmp = Int.MaxValue
      var j = 1
      while (j * j <= i) {
        tmp = Math.min(tmp, f(i - j * j) + 1)
        j += 1
      }
      f(i) = tmp
      i += 1
    }
    f(num)
  }

}
