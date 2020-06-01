object ValTest {
  def main(args: Array[String]): Unit = {
    var x:Int=12//定义变量
    x=15
    println(x)
    val y:Int=15//定义常量
    //y=16 //这行编译不通过  Error:(8, 6) reassignment to val
    val z="abc"//scala也可以自己推断数据类型
    println(z)
  }
}
