package com.cryptopal

/*

编译器找不到合适类型，就会隐式转换，
如果找不到合适的参数，会找相同类型的隐式变量;有多个能匹配上的就报错
一个函数如果有多个隐式变量，只能把最后一个用柯里化
隐式转换函数：implicit放在方法开头，源码中如果发现A没有method1，B有method1，但是调用了A.method1，可能是B隐式转换成了A
隐式类：implicit放在类前面
 */

object ImplicitConversion {

  def sayName(implicit name:String): Unit = {
    print(s"name is $name")
  }

  def main(args: Array[String]): Unit = {

    implicit val name12131:String = "z3"

    sayName


    implicit def RabbitToAnimal(r:Rabbit):Animal = {
      new Animal()
    }

    val r = new Rabbit()
    r.canFly()


  }

}


class Animal() {
  def canFly():Unit ={
    println("fly")
  }
}

class Rabbit() {

}

