package com.cryptopal

/*
1. List里面元素类型可以不同，但是一般放一样的,不然取出来是Nothing
2. List默认也是不可变的, 可变的是ListBuffer
3.
5.

 */

object Lists {

  def main(args: Array[String]): Unit = {


    val list = List[Int](1, 2, 3)
    val l = List[String]("hello scala", "hello java")
    var result = l.flatMap(s => {
      s.split(" ")
    })

 

    result.foreach(println(_))
  }

}
