package array

/**
  * Created by tpusers on 2017/2/10.
  */
object Search2DMatrix {
  def main(args: Array[String]): Unit = {
    print(search2DMatrix(Array(Array(1,3,5,7), Array(10,11,16,20), Array(23,30,34,50)), 0))
  }
  def search2DMatrix(A: Array[Array[Int]], target: Int): Boolean = {
    val rowNum = A.length
    if (rowNum == 0) false
    else {
      val colNum = A(0).length
      var length = colNum * rowNum - 1
      var l = 0
      while (l <= length) {
        val mid = (l + length) / 2
        if (A(mid / colNum)(mid % colNum) < target)
          l = mid + 1
        else if (A(mid / colNum)(mid % colNum) > target)
          length = mid - 1
        else return true
      }
      false
    }
  }
}
