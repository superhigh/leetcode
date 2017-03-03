package Greedy

import scala.io.Source

/**
  * Created by tpusers on 2017/2/19.
  */
object WordBreakII {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val string = s.next()
    val dict = s.next().split(',').toList
    print(wordBreak(string, 0, 0, dict, "", Nil))
    print(List(List(1,2),2).flatten)

  }
  def wordBreak(s: String, start: Int, prex: Int, dict: List[String], path: String, result: List[String]): List[String] = {
    if (start == s.length()) if (path.split(" ").mkString("") == s) path :: result else result
    else {
      val tmp =
      if (dict.contains(s.substring(prex, start + 1))) wordBreak(s, start + 1, start + 1, dict, path + (if (path == "") "" else " ") + s.substring(prex, start + 1), result)
      else result
      wordBreak(s, start + 1, prex, dict, path, tmp)

    }
  }
}
