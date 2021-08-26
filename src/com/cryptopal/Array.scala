package com.cryptopal

import scala.collection.mutable.ArrayBuffer
/*
1. 使用数组下标，用小括号()不是中括号，中括号在scala代表类型
2. 默认的Array是不可变的，可变的需要import ArrayBuffer
 */
object Arrays {
  def main(args: Array[String]): Unit = {

    val arr = Array[String]("a", "b", "c", "d")   //不用new，代表是object类型
    arr.foreach(println(_))
    val arr1 = new Array[String](3)
    arr1(0) = "a"
    arr1(1) = "b"
    //二维数组
    val arr2 = new Array[Array[Int]](3)
    arr2(0) = Array[Int] (1,2,3)

    Array.fill(5)("hello")

    val arrr1 = ArrayBuffer[Int](1,2,3)
    arrr1+=(4)
    arrr1.append(4)
  }

}
