package array

import scala.io.Source

/**
  * Created by tpusers on 2017/2/10.
  */
object SearchRange {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next().split(',').map(_.toInt)
    val target = s.next().toInt
    print(searchRange(in, target))
  }
  def searchRange(num: Array[Int], target: Int): (Int, Int) = {
    def binSearch(begin: Int, end: Int): (Int, Int) = {
      if (begin > end) (-1, -1)
      else if (num(begin) > target || num(end) < target) (-1, -1)
      else if (num(begin) == target && num(end) == target) (begin, end)
      else {
        val mid = (begin + end) / 2
        if (num(mid) < target) binSearch(mid + 1, end)
        else if (num(mid) > target) binSearch(begin, mid + 1)
        else {
          val l = binSearch(begin, mid - 1)
          val r = binSearch(mid + 1, end)
          val result_2 = Math.max(mid, r._2)
          val result_1 = if (l._1 == -1) mid else l._1
          (result_1, result_2)
        }
      }
    }
   if (num.length == 0) (-1,-1)
   else binSearch(0, num.length - 1)
  }
}
