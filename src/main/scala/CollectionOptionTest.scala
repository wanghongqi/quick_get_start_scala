object CollectionOptionTest {
  def main(args: Array[String]): Unit = {
    //for遍历
    val list=List(1,2,3)
    for(item<- list){
      println(item)
    }
    /*输出
        1
        2
        3
         */

    //foreach遍历
    val list2=List(1,2,3)
    list2.foreach(item=>println(item))
    /*输出
    1
    2
    3
     */

    //map 对集合中的每个元素传入函数处理并作为单个元素合并为集合返回
    val list3=List("whq","li","xx")
    printf("%s\n", list3.map(item=>item.toUpperCase()))
    //输出 List(WHQ, LI, XX)

    //flatMap 对集合中的每个元素传入函数进行拆分处理并作为多个元素合并为集合返回
    val list4=List("whq","li","xx")
    printf("%s\n", list4.flatMap(item=>item.toList))
    //输出 List(w, h, q, l, i, x, x)

    //filter 过滤集合
    val list5=List("whq","li","xx")
    printf("%s\n", list5.filter(item=>item.contains("w")))
    //输出 List(whq)

    //reduce   对集合进行归约（合并）处理
    val list6=List(1,2,3)
    println(list6.reduce(_-_)) //-4  从左往右逐个减
    println(list6.reduceLeft(_-_)) //-4  从左往右逐个减
    println(list6.reduceRight(_-_)) //2=1-(2-3)  从右往左逐个减

    //fold 在种子基础上对集合进行归约处理
    val list7=List(1,2,3)
    println(list7.fold(10)(_-_))  //4=10-1-2-3
    println(list7.foldLeft(10)(_-_))  //4=10-1-2-3
    println(list7.foldRight(10)(_-_)) //-8=1-(2-(3-10))


  }
}
