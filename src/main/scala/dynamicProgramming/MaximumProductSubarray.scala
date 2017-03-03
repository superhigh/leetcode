package dynamicProgramming


import scala.io.Source

/**
  * Created by tpusers on 2017/2/13.
  */
object MaximumProductSubarray {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines
    val in = s.next().split(',').map(_.toInt)
    print(maxSub(in))
  }
  def maxSub(in: Array[Int]): Int = {
    var maxSofar = in(0)
    var maxEndWith = in(0)
    var minEndWith = in(0)
    for (i <- 1 until in.length){
      val tmp = minEndWith
      minEndWith = Math.min(Math.min(maxEndWith * in(i), in(i)), minEndWith * in(i))
      maxEndWith = Math.max(Math.max(maxEndWith * in(i), in(i)), tmp * in(i))
      maxSofar = Math.max(maxEndWith, maxSofar)
    }
    maxSofar
  }

}
