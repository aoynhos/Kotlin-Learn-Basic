/**0、引言 Basic types基本数据类型
 * (1)上一章中我们知道kotlin会自动推导类型，并进行运算操作
 * */
fun main(){
//    operators()
//    declare()
    parctice()
}

/**1、基本运算符
 * (1) += -= *= /=
 *
 * */
fun operators(){
    var customers = 10

// Some customers leave the queue
    customers = 8
    println("客户还有${customers}人")
    customers = customers + 3 // Example of addition: 11
    println("客户还有${customers}人")
    customers += 7            // Example of addition: 18
    println("客户还有${customers}人")
    customers -= 3            // Example of subtraction: 15
    println("客户还有${customers}人")
    customers *= 2            // Example of multiplication: 30
    println("客户还有${customers}人")
    customers /= 3            // Example of division: 10
    println("客户还有${customers}人")
}

/**2、声明变量
 * (1)变量需要在使用前进初始化
 * (2)可以先声明变量但不初始化
 **/
fun declare(){
    val gold: Int
    gold = 30
    println(gold)
    val str: String = "gold price"
    println(str)
}

/**3、Practice 练习
 * 问题：声明每个变量正确的类型
 * */
fun parctice(){
    val a: Int = 1000
    val b = "log message"
    val c = 3.14
    val d = 100_000_000_000_000
    val e = false
    val f = '\n'
}

//fun parctice(){
//    val a: Int = 1000
//    val b:String = "log message"
//    val c:Double = 3.14
//    val d:Long = 100_000_000_000_000
//    val e:Boolean = false
//    val f:Char = '\n'
//}