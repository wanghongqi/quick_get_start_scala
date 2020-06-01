object CalculationTest {
  def main(args: Array[String]): Unit = {
    //算数运算符
    val a=1+2 //加法写法一
    val b=1.+(2)  //加法写法二（操作符就是方法，可以用方法的写法）
    val c=2-1 //减法
    val d=2*4 //乘法
    val e=4/2 //除法
    val f=5%2 //求余
    printf("a=%d\n",a)
    printf("b=%d\n",b)
    printf("c=%d\n",c)
    printf("d=%d\n",d)
    printf("e=%d\n",e)
    printf("f=%d\n",f)
    var g=5
    g+=1  //累加1，没有++、--这种写法，需要用+=1和-=1来代替
    printf("g=%d\n",g)
  }
}
