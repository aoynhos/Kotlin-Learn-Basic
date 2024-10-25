
import kotlin.math.PI
import kotlin.time.times

/**第五章、Functions函数
 *(1)使用fun关键字
 * */
fun hello() {
    return println("Hello, world!")
}

fun main() {
//    hello()
    // Hello, world!
//    println(sum(1,2))
//    var prefix = "问候"
//    var message = "Hello"
//    printMessageWithPrefix(message,prefix)
//    printMessageWithPrefix(prefix="水果",message="苹果")
//    greet(age = 18,name="张三")
//    printMessageWithPrefix1("这是一条简单的消息")
//    test(title = "biao")
//    println(registerUser("john_doe", "newjohn@example.com"))
//    // Username already taken. Please choose a different username.
//    println(registerUser("new_user", "newuser@example.com"))
//    // User registered successfully: new_user
//    println( Functionspractice01(2))
//    println( Functionspractice02(2))
//    Lambda()
//    Pass2AnotherFunction()
    functionTypes()

}



/**2、Named arguments命名参数
 *
 * */

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

/**3、Default parameter values 默认参数
 *(1)可以为函数参数设置默认值，调用时可以省略带有默认值的参数
 * */
fun greet(name: String, age: Int) {
    println("Hello, my name is $name and I am $age years old.")
}

fun printMessageWithPrefix1(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun test(msg:String="hello",title:String="【标题】"){
    println("$title msg is $msg")
}

/**4、Functions without return无返回值的函数
 *(1)如果没有有效的返回值，可以省略return
 * */

/**5、Single-expression functions单表达式函数
 *
 * */
//fun sum(x: Int, y: Int): Int {
//    return x + y
//}
fun sum(a:Int, b:Int) = a + b

/**6、Early returns in functions函数提前返回
 *
 * */
// A list of registered usernames
val registeredUsernames = mutableListOf("john_doe", "jane_smith")

// A list of registered emails
val registeredEmails = mutableListOf("john@example.com", "jane@example.com")

fun registerUser(username: String, email: String): String {
    // Early return if the username is already taken
    if (username in registeredUsernames) {
        return "Username already taken. Please choose a different username."
    }

    // Early return if the email is already registered
    if (email in registeredEmails) {
        return "Email already registered. Please use a different email."
    }

    // Proceed with the registration if the username and email are not taken
    registeredUsernames.add(username)
    registeredEmails.add(email)

    return "User registered successfully: $username"
}

/**问题：输入圆的半径，输出圆的面积
 *
 * */
fun Functionspractice01(radius:Int):Double{
    return radius *radius*PI
}

/**问题：将计算圆面积函数写成单行模式
 *
 * */

fun Functionspractice02(radius:Int)=radius*radius* PI

/**7、Lambda表达式
 *
 * */
fun uppercaseString(text: String): String {
    return text.uppercase()
}
fun Lambda(){
    val upperCaseString = { text: String -> text.uppercase() }
    println(uppercaseString("sssdqd"))
    println(upperCaseString("abc"))
    val hello = { println("hello") }
    hello()


}

/**8、Lambda表达式可以作为参数传递给其他函数
 *
 * */
fun Pass2AnotherFunction(){
    val numbers = listOf(1, -2, 3, -4, 5, -6)


    val positives = numbers.filter ({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
// [1, 3, 5]
    println(negatives)
// [-2, -4, -6]


    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled)
// [2, -4, 6, -8, 10, -12]
    println(tripled)
// [3, -6, 9, -12, 15, -18]

}

/**9、Function types函数类型
 *
 * */
fun functionTypes(){
    val upperCaseString: (String) -> String = { a -> a.uppercase() }
    println(upperCaseString("hello"))
    // HELLO
}

/**
 *
 * */