package com.cryptopal


/*
1. scala object  equals java singleton class, all methods or variables in object are static,相当于java的工具类
2. 变量常量类型可以不写，自动推断
3. 类中属性默认有getter和setter方法，改成var才有setter
4. 类中重写构造器要用this()，第一行必须调用默认的构造
5. new class时除了方法不执行，构造和其他一切都执行，比如println
6. 如果一个文件中object和class名字一样，那么object通常被用来初始化class，伴生对象和伴生类，两者之间可以互相访问私有变量
7. object不可以传参, 只有写了apply方法的类才可以传参 object(100) == object.apply(100), apply方法可以重载
8.


*/

class Person(xname: String, xage:Int) { //xname是私有变量，无法外部引用
  val name = xname
  val age = xage
  var gender = 'M'

  println("person class starts")
  def this(yname: String, yage:Int, ygender:Char) {
    this(yname, yage)
    this.gender = ygender

  }
  def sayName(): Unit = {
    println( s"name is $name" + ClassAndObject.name)
  }
  println("person class ends")
}

object ClassAndObject{
  val name = "lisi"
  def apply(i: Int): Unit = {
    println(i)
  }

  def apply(i: Int, s:String) : Unit = {
    print(i)
    print(s)
  }
  def main(args: Array[String]) : Unit = {


    ClassAndObject(100)

   val a = 100

    println(a)
    val p = new Person(xname="zhangsan", xage = 20)
    println(p.name)
    p.sayName()


    var r = 1 to 10 //include 10
    val r1= 1 until 10 //exclude 10
    println(r)
    println(r1)
    for (i<-1 to 10)
      print(i)

    //while
    var i = 0
    while( i < 100) {

    }

  }
}

