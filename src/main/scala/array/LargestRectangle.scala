package array

import scala.io.Source

/**
  * Created by tpusers on 2017/2/9.
  */
object LargestRectangle {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next()
    print(largestRectangle(in.split(',').map(_.toInt)))
  }
  def largestRectangle(height: Array[Int]): Int = {
    val s = collection.mutable.Stack[Int]()
    var i = 0
    var maxRectangle = 0
    while (i <= height.length) {
      val h = if ( i == height.length) 0 else height(i)
      if (s.isEmpty || h > height(s.top)) {
        s.push(i)
        i += 1
      }
      else{
        val tp = s.pop
        maxRectangle = Math.max(maxRectangle, (if (s.isEmpty) i else i - 1 - s.top) * height(tp))
      }

    }
    maxRectangle
  }

}
