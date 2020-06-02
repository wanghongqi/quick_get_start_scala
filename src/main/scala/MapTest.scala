object MapTest {
  def main(args: Array[String]): Unit = {
    //声明
    val myMap=Map("s"->"spark","h"->"hadoop")
    printf("%s\n",myMap)
    //输出 Map(s -> spark, h -> hadoop)
    val myEmpty=Map()
    printf("%s\n",myEmpty)
    //输出 Map()
    //myMap("h")="hbase" 这行代码会报错，因为默认的Map不可变

    //声明可变映射
    val myMutableMap=scala.collection.mutable.Map("s"->"spark","h"->"hadoop")
    myMutableMap("h")="hbase"
    //添加元素
    myMutableMap+=("j"->"java")
    //判断为空
    println(myEmpty.isEmpty)//输出 true
    //返回所有键
    printf("%s\n",myMap.keys)//输出 Set(s, h)
    //返回所有值
    printf("%s\n",myMap.values)//输出 MapLike(spark, hadoop)
    //合并（自动去重）
    printf("%s\n", Map("s"->"spark","h"->"hadoop")++ Map("h"->"hbase","j"->"java"))
    //输出 Map(s -> spark, h -> hbase, j -> java)

    //是否存在指定key
    println(myMap.contains("h"))//输出 true
    //获取key对应的值
    println(myMap("h"))//输出hadoop
    //遍历
    for((k,v)<- myMap) printf("key:%s,value:%s\n",k,v)
    /*输出
    key:s,value:spark
    key:h,value:hbase
    */
  }
}
