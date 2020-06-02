class Counter {
  private var privateValue = 0  //私有字段
  def value = privateValue //相当于value的getter 定义一个方法，方法的名称就是原来我们想要的字段的名称
  def value_=(newValue: Int){//相当于value的setter
    if (newValue > 0) privateValue = newValue //只有提供的新值是正数，才允许修改
  }
  //有参数方法
  def increment(step: Int): Unit = { value += step}
  //无参数方法
  def current(): Int = {value}
}
object MyCounter{
  def main(args:Array[String]){
    val myCounter = new Counter//创建对象Counter
    println(myCounter.value)  //打印value的初始值
    myCounter.value = 3 //为value设置新的值
    println(myCounter.value)  //打印value的新值
    myCounter.increment(1) //这里设置步长为1，每次增加1
    println(myCounter.current)
  }
}