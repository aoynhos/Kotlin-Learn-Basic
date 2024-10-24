/**第三章、Collections 集合
 *    list sets map
 * */

fun main(){
//    listUse()
//    set()
//    mapUse()
//    Exercise1()
//    Exercise2()
    Exercise3()

}

/**1、list 列表
 * (1)listof 声明只可读
 * (2)mutablelistof 声明可变
 * (3)可以通过类型转换的方式赋值，创建可变list的只读视图
 * (4)list使用 [] 和下标进行元素的访问
 * (5)使用.first() .last()
 * (6)获取list中元素个数，使用 .count()
 * (7)使用 in 来查询元素是否存在于list中
 * (8) .add 用于添加元素 .remove 用于删除元素
 * */
fun listUse() {
    //1
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println(readOnlyShapes)
    //2
    var variableList: MutableList<String> = mutableListOf("apple", "banana", "pear", "grape")
    println(variableList)
    //3
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes
    println(shapesLocked)
    //4
    println("The first item in the readOnlyShapes list is: ${readOnlyShapes[0]}")
   //5
    println(readOnlyShapes.first()+" "+readOnlyShapes.last())
    //6
    println(readOnlyShapes.count())
    //7
    println("triangle" in shapesLocked)
    //8
    variableList.add("watermelon")
    variableList.remove("apple")
    println(variableList)
}

/**2、Set 集合
 * (1)setOf创建只读set mutableSetOf创建可变set
 * (2)set中出现重复元素会自动删除
 * (3)可以将可变集合赋值给只读集合创建可变集合的只读视图
 * (4)set无法通过 []索引的方式来访问元素
 * (5)使用.count来获取set中元素的个数
 * (6)使用in来判断元素是否在集合中
 * (7)使用.add添加元素 .remove删除元素
 * */
fun set(){
    // Read-only set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    // Mutable set with explicit type declaration
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    println(readOnlyFruit)
    // [apple, banana, cherry]

    val fruitLocked:Set<String> = fruit
    //5
    println("there has ${fruitLocked.count()} fruits")
    //6
    println("cherry" in fruitLocked)
    //7
    fruit.add("watermelon")
    println(fruitLocked)
    fruit.remove("apple")
    println(fruitLocked)

}

/**3、map字典
 * (1)map 将数据存为键值对，可以通过键快速获取对应的值
 * (2)key 是唯一的 value可以相同
 * (3)可以将可变字典赋值给只读字典创建可变字典的只读视图
 * (4)使用 [key]来获取value 如果key不存在则返回null,也可以使用[key] 来添加键值对
 * (5)使用.remove来删除键值对
 * (6)使用.count来计数
 * (7)使用.containsKey()判断键是否存在字典中
 * (8)使用 .keys 获取map中所有的key值 .values获取map中所有value值 由于获取到的是一个集合，所以可以用in来判断
 * */
fun mapUse(){
// Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
// {apple=100, kiwi=190, orange=100}
    //3
    val juiceMenuLocked: Map<String, Int> = juiceMenu
    //4
    println(juiceMenuLocked["apple"])
    println(juiceMenuLocked["www"])
    juiceMenu["www"] = 150
    println(juiceMenuLocked["www"])
    //5
    juiceMenu.remove("www")
    println(juiceMenuLocked)
    //6
    println(juiceMenuLocked.count())
    //7
    println(juiceMenuLocked.containsKey("apple"))
    //8
    println(juiceMenuLocked.keys+"${"apple" in juiceMenuLocked.keys}")
    println(juiceMenuLocked.values+"${101 in juiceMenuLocked.values}")

}
/**问题：这里有两种不同颜色的数字，请问一共有多少个数字
 *
 * */
fun Exercise1(){
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    // Write your code here
    println(greenNumbers.count()+redNumbers.count())
}

/**问题：你的服务器有一组协议 ，用户登陆时需要判断用户使用的协议是否可以访问服务器
 *
 * */
fun Exercise2(){
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "ftp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")
}

/**问题：创建一个map将1-3转换为对应的字符
 *
 * */
fun Exercise3(){
    val number2word = mutableMapOf(1 to "one",2 to "two",3 to "three")
    val n = 1
    println("$n is spelt as '${number2word[n]}'")
}