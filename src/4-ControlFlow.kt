/**第四章 控制语句
 *
 * */
import kotlin.random.Random

fun main(){
//    ifUse()
//    whenUse()
//    Exercise41()
    Exercise42()
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

        val button = "X"

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
