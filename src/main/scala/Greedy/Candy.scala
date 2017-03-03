package Greedy

import scala.io.Source

/**
  * Created by tpusers on 2017/2/15.
  */
object Candy {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines
    val in = s.next().split(',').map(_.toFloat)
    print(candy(in))
  }
  def candy(rates: Array[Float]) = {
    var f = 1
    var count = 1
    var k = 0 // the num of
    for (i <- 1 until rates.length){
      f =
        if (rates(i) > rates(i - 1)){
          k = 0
          count += 1
          f + count
        }
        else{
          k += 1
          if (count == 1)
            f + k + 1
          else {
            count = 1
            f + 1
          }
        }
    }
    f
  }

}
