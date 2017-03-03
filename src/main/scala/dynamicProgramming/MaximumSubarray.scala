package dynamicProgramming

import scala.io.Source

/**
  * Created by tpusers on 2017/2/13.
  */
object MaximumSubarray {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next().split(',').map(_.toInt)
    print(maximumSubII(in))
  }
  def maximumSub(in: Array[Int]) = {
    var sum = 0
    var d = 0
    for (i <- 0 until in.length){
      sum += in(i)
      d = Math.max(d, sum)
      sum = if (sum < 0) 0 else sum
    }
    d
  }

  def maximumSubII(in: Array[Int]) = {
    var maxSofar = in(0)
    var maxEndWith = in(0)
    for (i <- 1 until in.length){
      maxEndWith = Math.max(maxEndWith + in(i), in(i))
      maxSofar = Math.max(maxSofar, maxEndWith)
    }
    maxSofar
  }





}
