object RangeTest {
  def main(args: Array[String]): Unit = {
    val a=1 to 5  //创建一个从1到5的数值序列，包含区间终点5，步长为1
    println(a)
    val b=1 until 5 //创建一个从1到5的数值序列，不包含区间终点5，步长为1
    println(b)
    val c=0.1 to 10.1 by 2.5 //创建一个从0.1到10.1的数值序列，包含区间终点10.1，步长为2.5
    println(c)
  }
}
