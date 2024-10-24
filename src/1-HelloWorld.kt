
/**第一章helloworld hello kotlin- 你的第一个kotlin程序
 * (1)fun 是定义函数的入口
 * (2)main 是kotlin的启动函数
 * (3)main(){}中的{}用来写函数体
 * */
fun main(){
//    helloWorld()
//    Variables()
//    StringTemplates()
    Exercise()
}

fun helloWorld(){
    print("Hello World!")
    println("Hello Kotlin!")
}

/**2、Variables-变量
 * (1)val 定义的变量只能读，不可变
 * (2)var 定义的变量可以变，使用 = 赋值
 * (3)变量可以定义在函数之外
 * */
val hotdog = 7
fun Variables(){
    val popcorn = 5    // There are 5 boxes of popcorn
        // There are 7 hotdogs
    var customers = 10 // There are 10 customers in the queue

// Some customers leave the queue
    customers = 8
    println(customers)
    // 8
    println(hotdog)
    //7

}

/**3、String templates 字符串模板
 *(1)定义字符串用 "" 包含
 *(2)在字符串内部引用变量加上${}
 *(3)${}中只能做运算操作，不能做赋值操作
 *(4) kotlin中var和val都不用指定变量类型，因为kotlin会自动进行类型推导
 * */
fun StringTemplates(){
    var str = "这是一个字符串"
    var age = 10
    println(str)
    println("这个人今年${age+10}岁了")
}

/**4、练习
 * 问题：让控制台输出"Mary is 30 years old"
 * */
fun Exercise(){
    val name = "Mary"
    val age = 20
    // Write your code here

}

//fun Exercise(){
//    val name = "Mary"
//    val age = 20
//    println("${name} is ${age+10} years old")
//}