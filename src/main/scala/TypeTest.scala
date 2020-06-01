object TypeTest {
  def main(args: Array[String]): Unit = {
    val a:Byte=127  //8位有符号补码整数。数值区间为 -128 到 127
    val b:Short=32  //16位有符号补码整数。数值区间为 -32768 到 32767
    val c:Int=2137483647  //32位有符号补码整数。数值区间为 -2147483648 到 2147483647
    val d:Long=1223372036854775807L //64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
    val e:Float=1.324f //32 位, IEEE 754 标准的单精度浮点数
    val f:Double=3243.123 //64 位 IEEE 754 标准的双精度浮点数
    val g:Char='a'  //16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
    val h:String="Hello"  //字符序列
    val i:Boolean=true //true或false
    val j:Unit=() //Unit 表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
    val k:Null=null // null 或空引用
    val l:Any=1 //Any是所有其他类的超类
    println(l)
    val m:AnyRef="sadf" //AnyRef类是Scala里所有引用类(reference class)的基类
    println(m)
    //多行字符串写法
    val n:String=
      """sadfasdf
sdfdsf
123"""
    println(n)
    val o:String=
      """stringO
        |sdfsd
        |123213213""".stripMargin
    println(o)
  }
}
