package backTracking

import scala.io.Source

/**
  * Created by tpusers on 2017/2/11.
  */
object Combination {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val topNum = s.next().toInt
    val num = s.next().toInt
    val result = combination(topNum, num)
    print(result)
    println()
    print(result.length)
  }
  def combination(topNum: Int, num: Int): List[List[Int]] = {
    def dfs(path: List[Int], index: Int, num: Int): List[List[Int]] = {
      if (num == 0) path :: Nil
      else if (index > topNum) Nil
      else dfs(index :: path, index + 1, num - 1) ::: dfs(path, index + 1, num)
    }
    if (topNum < num) Nil
    else
      dfs(Nil, 1, num)
  }

}
