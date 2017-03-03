package dynamicProgramming

import scala.io.Source

/**
  * Created by tpusers on 2017/2/13.
  */
object UniqueBinarySearchTrees {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines
    val num = s.next().toInt
    print(numOfTrees(num))
  }
  def numOfTrees(n: Int) = {
    val f = new Array[Int](n + 1)
    f(0) = 1
    for (i <- 1 to n)
      for (k <- 1 to i)
        f(i) += f(k - 1) * f(i - k)
    f(n)
  }
}
