object SetTest {
  def main(args: Array[String]): Unit = {
    //声明集合
    var mySet=Set("a","b")
    //添加元素
    mySet+="c"// val mySet=Set("a","b") 不能添加元素
    println(mySet.mkString(","))//输出 a,b,c
    //声明可变集合
    val myMutableSet = scala.collection.mutable.Set("a","b")
    myMutableSet+="c"
    println(mySet.mkString(","))//输出 a,b,c

    //获取第一个元素
    println(mySet.head)//输出 a
    //获取后面的元素
    println(mySet.tail.mkString(","))//输出 b,c
    //判断是否为空
    println(mySet.isEmpty)//输出 false
    //连接集合（自动去重）
    println((Set(1,2)++ Set(2,3)).mkString(","))//输出 1,2,3
    //最大值最小值
    println(Set(1,2,3,4).max)//输出 4
    println(Set(1,2,3,4).min)//输出 1
    //交集
    println((Set(1,2) & Set(2,3)).mkString(","))//输出 2

  }
}
