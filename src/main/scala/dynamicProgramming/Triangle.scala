package dynamicProgramming

/**
  * Created by tpusers on 2017/2/13.
  */
object Triangle {
  def main(args: Array[String]): Unit = {
    print(triangle(Vector(Vector(2), Vector(3,4), Vector(6,5,7), Vector(4,1,8,3))))
  }
  def triangle(t: Vector[Vector[Int]]) = {
    val depth = t.length
    val path = Array.ofDim[Int](depth, t(depth - 1).length)
    val bottom = t(depth - 1)
    for (i <- 0 until bottom.length)
      path(depth - 1)(i) = bottom(i)
    for (i <- depth - 2 to 0 by -1){
      val arrayI = t(i)
      for (j <- 0 to i)
        path(i)(j) = Math.min(path(i + 1)(j), path(i + 1)(j + 1)) + arrayI(j)
    }
    path(0)(0)
  }
}
