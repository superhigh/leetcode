package array

import java.util

import scala.io.Source

/**
  * Created by tpusers on 2017/2/9.
  */
object PascalTriangle {
  def main(args: Array[String]): Unit = {
    val n = Source.stdin.getLines().next().toInt
    val result = generate(n)
    printList(0, result)
  }
  def printList(n: Int, result: List[List[Int]]): Unit = result match {
    case Nil =>
    case h :: tail =>
      printList(n + 1, tail)
      println()
      print(" " * n)
      for(item <- h)
        print(item + " ")
  }
  def generate(numRows: Int): List[List[Int]] = {
    def helpGenerate(r: List[List[Int]], a: Array[Int], n: Int): List[List[Int]] = {
      if (n == 0) r
      else {
        val num = a.length
        val newA = new Array[Int](num + 1)
        var i = 0
        newA(0) = 1
        newA(num) = 1
        while (i < num / 2) {
          newA(i + 1) = a(i) + a(i + 1)
          newA(num - i - 1) =  newA(i + 1)
          i += 1
        }
        helpGenerate(newA.toList :: r, newA, n - 1)
      }
    }
    val lst1 = List(1)
    val lst2 = List(1, 1)
    if (numRows == 1) lst1 :: Nil
    else if (numRows == 2) lst1 :: lst2 :: Nil
    else{
      helpGenerate(lst2 :: lst1 :: Nil, Array(1, 1), numRows - 2)
    }
  }
}
