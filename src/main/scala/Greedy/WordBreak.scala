package Greedy

import scala.io.Source

/**
  * Created by tpusers on 2017/2/19.
  */
object WordBreak {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val str = s.next()
    val dict = s.next().split(',').toList
    print(wordBreak(str, dict))
  }
  def wordBreak(s: String, dict: List[String]) = {
    val f = new Array[Boolean](s.length + 1)
    f(0) = true

    for (i <- 1 to s.length){
      for (j <- 0 until i)
        if (f(j) && dict.contains(s.substring(j, i)))
          f(i) = true
    }
    f(s.length)
  }

}
