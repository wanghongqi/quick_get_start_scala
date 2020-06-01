object ControlTest {
  def main(args: Array[String]): Unit = {
    //if条件判断
    println("if条件判断")
    var x = 20;
    if( x == 10 ){
      println("X 的值为 10")
    }else if( x == 20 ){
      println("X 的值为 20")
    }else{
      println("无法判断 X 的值")
    }
    //if条件赋值
    val y = 3
    val a = if (y>1) 1 else -1
    println("if条件赋值："+a)
    //while循环 满足条件执行
    println("while循环")
    var i=5
    while(i>0){
      i-=1
      println(i)
    }
    //do while循环 先执行一次，满足条件继续执行
    println("do while循环")
    var j=5
    do{
      j-=1
      println(j)
    }while(j>0)
    //for循环
    println("for循环")
    for (i <- 1 to 5) println(i) //<-表示，之前的i要遍历后面1到5
    println("——————————遍历也可以设置步长")
    for (i <- 1 to 5 by 2) println(i) //遍历也可以设置步长(设置步长为2)
    println("——————————守卫（guard）表达式")
    for (i <- 1 to 5 if i%2==0) println(i) //守卫（guard）表达式，只输出偶数
    println("——————————多生成器")
    for (i <- 1 to 3; j <- 1 to 2) println(i*j) //多生成器
    println("——————————多生成器带守卫")
    for (i <- 1 to 3 if i%2==0; j <- 1 to 2 if i!=j) println(i*j) //多生成器带守卫
    //for推导式 有时候，我们需要对上述过滤后的结果进行进一步的处理，这时，就可以采用yield关键字，对过滤后的结果构建一个集合。
    println("for推导式")
    val b=for (i <- 1 to 5 if i%2==0) yield i
    println(b)
    //for遍历集合
    println("for遍历集合")
    val numList = List(1,2,3,4,5,6);
    for( a <- numList ){
      println( "Value of a: " + a );
    }

    ///break scala里没有break和continue，但是2.8之后break可以采用如下写法实现
    println("break替代实现")
    // 导入以下包
    import scala.util.control._
    // 创建 Breaks 对象
    val loop = new Breaks;
    // 在 breakable 中循环
    loop.breakable{
      // 循环
      for(i<- 1 to 5){
        println(i)
        // 循环中断
        if(i>2)
          loop.break;
      }
    }
  }
}
