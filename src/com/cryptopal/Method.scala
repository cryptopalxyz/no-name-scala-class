package com.cryptopal

import java.util.Date

/*
方法：有参方法，无参方法， def
1. 方法中返回值可以省略，会自动推断
2. 传入的参数要制定类型，
3. 如果方法体是一行，可以把大括号{ }去掉，等号=可以去掉
4. 如果省略了=，无论方法体的结果，都会被丢弃
5. 递归方法必须定义返回值类型
6. 参数有默认值的，再传值可以覆盖默认值
7. 可变长参数的方法 fun(s: String *)，只能一个类型 fun(s: Any*)
8. =>就是匿名函数   ()=>{}，多用于方法的参数是函数时，
9. 函数输入.var, 选中variable看函数输入和返回值
10.方法和函数区别, 函数多一个输入和返回值
def fun_method(a: Int): Int = { a +1 }
def fun_function(Int) => Int = (a:int) => { a + 1 }
方法转化成函数,在后面加一个下划线 fun _
11. 偏应用函数, 当方法中参数很多时，为了每次调用省略不变的变量，可以定义新的偏应用函数，用_代替可变的变量
12. 高阶函数：
a)方法的参数是函数
b)方法的返回是函数，必须显示的写出函数的返回值..柯里化
c)方法的参数和返回都是函数
13. 柯里化，隐式转换要用
def fun(a:Int, b:Int)(c:Int, d:Int): Int = {
a+b+c+d }
print(fun(a,b)(c,d))
14.
15
柯里化，
函数：

 */
object Method {

  def main(args: Array[String]): Unit = {

    def max(a:Int, b:Int)= {
       if (a>b) a else b

    }

    def max1(a:Int, b:Int)= if (a>b) a else b

    println(max1(199, 10))


    //递归方法
    def fun(number: Int): Int = {
      if (number == 1) 1 else number*fun(number -1 )
    }

    def fun1(s:Any*): Unit = {
      s.foreach(println(_))
    }

    fun1("abcdfdf", 123,"dfdf")
    (s: String) => {
      print(s)
    }

      def showLog(date: Date, log:String) = {
        println(s"date is $date, log is $log")
      }
      val date = new Date()
      showLog(date, "a")
      showLog(date, "b")


      def showLog1 = showLog(date, _:String)
      showLog1("a")
      showLog1("b")


  }




}
