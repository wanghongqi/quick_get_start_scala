import scala.reflect.ClassTag

object ArrayTest {
  def main(args: Array[String]): Unit = {
    //声明数组
    val arr:Array[String]=new Array[String](3)//声明一个长度为3的字符串数组，每一项初始值为null，与val arr=new Array[String](3)等效
    println("arr:"+arr.mkString(","))
    //数组赋值
    arr(0)="a"
    arr(1)="b"
    arr(4/2)="c"//会计算4/2=2后，对arr(2)进行赋值
    println("arr:"+arr.mkString(","))
    //直接声明和赋值
    val arrC=Array("a","b","c")
    println("arrC:"+arrC.mkString(","))
    val arrI=Array(1,6,3)
    println("arrI:"+arrI.mkString(","))
    //常用方法
    println("max:"+arrI.max)  //最大值
    println("min:"+arrI.min)  //最小值
    println("sum:"+arrI.sum)  //求和
    ///////////多维数组
    println("二维数组")
    ////写法1
    val arr2=Array(
      Array(1,2,3),
      Array(2,3,4),
      Array(3,4,5)
    )
    ////写法2
    //Array.ofDim为多维数组声明的快捷写法，转到定义可以看到ofDim支持1-5维的数组，如果要写更高维度的，可以参照ofDim的定义进行扩充。
    val myMatrix = Array.ofDim[Int](3, 3)
    // 创建矩阵
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }
    // 打印二维阵列
    for (i <- 0 to 2) {
      for ( j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
    ////////////六七维数组快速创建
    //六维数组
    println("六维数组")
    val myArr6 = ofDim[Int](3, 3,2,2,2,2)
    myArr6(0)(0)(0)(0)(0)(0)=1
    println(myArr6(0)(0)(0)(0)(0)(0))
    //七维数组
    println("七维数组")
    val myArr7 = ofDim[Int](2, 2,2,2,2,2,2)
    myArr7(0)(0)(0)(0)(0)(0)(0)=1
    println(myArr7(0)(0)(0)(0)(0)(0)(0))
    //合并数组
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)
    var myList3 =  Array.concat( myList1, myList2)
    println("myList3:"+myList3.mkString(","))
    //区间数组
    println("区间数组")
    println(Array.range(1,5).mkString(","))
    println(Array.range(1,10,2).mkString(","))//2为步长
  }

  //六维数组
  def ofDim[T: ClassTag](n1: Int, n2: Int, n3: Int, n4: Int, n5: Int, n6: Int): Array[Array[Array[Array[Array[Array[T]]]]]] =
    Array.tabulate(n1)(_ => Array.ofDim[T](n2, n3, n4, n5, n6))
  //七维数组
  def ofDim[T: ClassTag](n1: Int, n2: Int, n3: Int, n4: Int, n5: Int, n6: Int, n7: Int): Array[Array[Array[Array[Array[Array[Array[T]]]]]]] =
    Array.tabulate(n1)(_ => ofDim[T](n2, n3, n4, n5, n6,n7))
}
