package Greedy

import scala.io.Source

/**
  * Created by tpusers on 2017/2/15.
  */
object JumpGame {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines
    val in= s.next().split(',').map(_.toInt)
    print(jumpGameII(in))
  }
  def jumpGame(a: Array[Int]): Boolean = {
    var i = 0
    while (i < a.length - 1){
      if (a(i) == 0) return false
      i += a(i)
    }
    if(i == a.length - 1) true else false
  }
  def jumpGameII(a: Array[Int]): Int = {
    var maxReach = a(0)
    var count = 0
    var j = 1
    while (maxReach < a.length - 1){
      val tmp = maxReach
      while (j <= tmp){
        maxReach = Math.max(maxReach, j + a(j))
        j += 1
      }
      count += 1
    }
    count + 1
  }

}
