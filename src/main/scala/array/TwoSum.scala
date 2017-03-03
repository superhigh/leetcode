package array

import scala.io.Source

/**
  * Created by tpusers on 2017/2/9.
  */
object TwoSum {
  def main(args: Array[String]): Unit = {
    val s = Source.stdin.getLines()
    val in = s.next()
    val target = s.next().toInt
    print(twoSum(in.split(',').map(_.toInt), target))
  }
  def twoSum(nums: Array[Int], target: Int): (Int, Int) = {
    val hashMap = collection.mutable.HashMap[Int, Int]()
    var i = 0
    while (i < nums.length){
      if (hashMap.contains(target - nums(i))) return (hashMap(target - nums(i)), i)
      else {
        hashMap.put(nums(i), i)
        i += 1
      }
    }
    (-1, -1)
  }
}
