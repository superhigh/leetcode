package array

import scala.io.Source

/**
  * Created by tpusers on 2017/2/9.
  */
object MergeSort {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val inA = s.next()
    val m = s.next().toInt
    val inB = s.next()
    val n = s.next().toInt
    val A = new Array[Int](m + n)
    var i = 0
    for (d <- inA.split(',')) {
      A(i) = d.toInt
      i += 1
    }
    val B = inB.split(',').map(_.toInt)
    for (d <- mergeSort(A, m, B, n))
      print(d + " ")
  }
  def mergeSort(A: Array[Int], m: Int, B: Array[Int], n: Int) = {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1
    while (i >= 0 && j >= 0){
      A(k) = if (A(i) > B(j)){i -= 1; A(i + 1)} else{ j -= 1; B(j + 1)}
      k -= 1
    }
    while (j >= 0){
      A(k) = B(j)
      k -= 1
      j -= 1
    }
    A
  }

}
