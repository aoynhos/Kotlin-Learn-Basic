/**第四章 控制语句
 *
 * */
import kotlin.random.Random

fun main(){
//    ifUse()
//    whenUse()
//    Exercise41()
//    Exercise42()
//    forUse()
//    whileUse()
//    Exercise01()
//    Exercise02()
    Exercise03()
}

/**1、IF
 *(1)没有三元运算符，但写在一行可以不写{}
 * */
fun ifUse(){
    val d: Int
    val check = false

    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)
// 1

    val a = 1
    val b = 2

    println(if (a > b) a else b) // Returns a value: 2
}

/**2、when
 * (1)所有分支都会按顺序检查 直到出现条件相同
 * */
fun whenUse(){
    val obj = "石头"

    when (obj) {
        // Checks whether obj equals to "1"
        "石头" -> println("布")
        // Checks whether obj equals to "Hello"
        "剪刀" -> println("石头")
        // Default statement
        else -> println("剪刀")
    }
// Greeting

    val obj2 = "Hello"

    val result = when (obj2) {
        // If obj equals "1", sets result to "one"
        "1" -> "One"
        // If obj equals "Hello", sets result to "Greeting"
        "Hello" -> "Greeting"
        // Sets result to "Unknown" if no previous condition is satisfied
        else -> "Unknown"
    }
    println(result)
// Greeting

    val trafficLightState = "Red" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when     {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
    // Stop
}

fun Exercise41(){
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here
    if (firstResult == secondResult){
        println("$firstResult $secondResult you win")
    }else{
        println("$firstResult $secondResult you lose")
    }
}

fun Exercise42(){

        val button = "A"

        println(
            when(button){
                "A" -> "Yes"
                "B" -> "No"
                "X" -> "Menu"
                "Y" -> "Nothing"
                else -> "There is no such button"
            }
        )
}

/**3、Loops 循环
 * 最常见的是for循环已经while循环
 * */
fun forUse(){
    for (num in 0..10) {
        print(num)
    }
    println()

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}

/**4、While循环
 *
 * */
fun whileUse(){
//    var cakesEaten = 0
//    while (cakesEaten <= 3) {
//        println("Eat a cake")
//        cakesEaten++
//    }

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 2) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}
/**问题：计算披萨片数直到8片
 *
 * */
fun Exercise01(){
    var pizzaSlices = 0
    // Start refactoring here
//    for(pizza in 1..8){
//        pizzaSlices++
//    }
    while(pizzaSlices!=8){
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    }
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

/**问题：递归打印1-100的数字任何能被3整除的数字替换为“fizz”，
 * 将任何可被5整除的号码替换为“buzz”。任何能被3和5整除的数字都必须替换为“fizzbuzz”
 *
 * */
fun Exercise02(){
//    var num = 1
//    while(num <= 100){
//        if(num%3==0 && num%5==0){
//            println("fizzbuzz")
//        }
//        else if(num%3==0){
//            println("fizz")
//        }
//        else if(num%5==0){
//            println("buzz")
//
//        }else{
//            println(num)
//        }
//        num++
//    }
    for(num in 1..100){
        println(when{
            num % 15 ==0 -> "fizzbuzz"
            num % 3==0  -> "fizz"
            num % 5 == 0 -> "buzz"
            else -> "$num"
        })
    }
}

/**问题：有一个单词列表，输出以l开头的单词
 *(1).startsWith("") 判断字符串是否以xx开头
 * */
fun Exercise03(){
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    // Write your code here
    for(word in words){
        if(word.startsWith("l"))
            println(word)
    }
}



