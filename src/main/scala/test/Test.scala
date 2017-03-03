package test

import scala.io.Source

/**
  * Created by tpusers on 2017/2/9.
  */
object Test {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin
    val l = s.getLines()
    println(l.next)
  }

}
