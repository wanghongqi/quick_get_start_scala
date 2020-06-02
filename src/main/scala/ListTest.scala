object ListTest {
  def main(args: Array[String]): Unit = {
    //声明方式1
    val myList=List(1,2,3)
    println(myList.mkString(","))//输出 1,2,3
    //声明方式2
    val myList2=1::2::3::Nil  //结尾的Nil表示空列表
    println(myList2.mkString(","))//输出 1,2,3
    //获取头部
    val head=myList.head
    println(head)//输出 1
    //获取尾部
    val tail=myList.tail
    println(tail.mkString(","))//输出 2,3 说明尾部还是一个列表
    //头部增加元素
    val myListOther=0::myList
    //此时列表为myListOther: List[Int] = List(0, 1, 2, 3)
    println(myListOther.mkString(","))//输出 0,1,2,3

    //常用方法
    println(myList.max)	//最大值 3
    println(myList.min)	//最小值 1
    println(myList.sum)	//求和 6

    //二维列表
    val list: List[List[Int]]=List(
      List(1,2,3),
      List(2,3,4),
      List(3,4,5)
    )
    printf("%s\n",list)
    //输出 List(List(1, 2, 3), List(2, 3, 4), List(3, 4, 5))

    //空列表写法1
    val empty: List[Nothing] = List()
    //空列表写法2
    val empty2=Nil
    //判断是否为空列表
    println(empty.isEmpty)//输出 true

    //列表连接
    //:::或者List.concat(list1,list2……)
    val list1=List(1,2,3)
    val list2=List(4,5,6)
    println((list1:::list2).mkString(","))//输出 1,2,3,4,5,6
    println(List.concat(list1,list2).mkString(","))//输出 1,2,3,4,5,6

    //List.fill 填充多个相同的值
    println(List.fill(3)("a").mkString(","))//输出 a,a,a
    println(List.fill(4)(5).mkString(","))//输出 5,5,5,5

    //List.tabulate
    //通过给定函数创建1-5维的列表
    println(List.tabulate(4)(n => n * n).mkString(","))//输出 0,1,4,9
    //二维列表
    printf("%s\n",List.tabulate( 4,5 )( _ * _ ))
    //输出 List(List(0, 0, 0, 0, 0), List(0, 1, 2, 3, 4), List(0, 2, 4, 6, 8), List(0, 3, 6, 9, 12))

    //三维列表
    printf("%s\n",List.tabulate( 3,3,3 )( _ * _ * _ ))
    //输出 List(List(List(0, 0, 0), List(0, 0, 0), List(0, 0, 0)), List(List(0, 0, 0), List(0, 1, 2), List(0, 2, 4)), List(List(0, 0, 0), List(0, 2, 4), List(0, 4, 8)))

    //List.reverse 列表顺序反转
    println(List(1,2,3).reverse.mkString(","))//输出 3,2,1
  }
}
