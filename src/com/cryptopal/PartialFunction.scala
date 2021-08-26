package com.cryptopal

/*
如果一个函数体只有case，那么这个函数就是一个偏函数
并且不能用（）传餐
 */
object PartialFunction {

  def MyTest: PartialFunction[String, Int] = {
    case "abc" => 2
    case "a" => 1
    case _ => 200
  }
  def main(args: Array[String]): Unit = {
    val result = MyTest("abc")
    print(result)
  }
}
