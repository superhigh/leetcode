package dynamicProgramming

import scala.io.Source

/**
  * Created by tpusers on 2017/2/13.
  */
object ClimbingStairs {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines
    val n = s.next().toInt
    print(climbingStairs(n))
  }
  def climbingStairs(n: Int): Int = {
    val d = new Array[Int](n + 1)
    d(0) = 1
    d(1) = 1
    for (i <- 2 to n) {
      d(i) = d(i - 1) + d(i - 2)
    }
    d(n)
  }
}
