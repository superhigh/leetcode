package Greedy

/**
  * Created by tpusers on 2017/2/15.
  */
object GasStation {
  def main(args: Array[String]): Unit = {

  }
  def gasStation(gas: Array[Int], cost: Array[Int]) = {
    var sum = 0
    var totalGas = 0
    var totalCost = 0
    var k = 0
    for (i <- 0 until gas.length){
      sum += (gas(i) - totalCost)
      if (sum < 0){ sum =  0; k = i + 1 }
      totalGas += gas(i)
      totalCost += cost(i)
    }
    if (totalGas >= totalCost) k
    else -1
  }

}
