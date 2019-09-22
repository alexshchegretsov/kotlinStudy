fun main() {
    val foo = 20
    if (foo == 50) {
        println("$foo is equal 50")
    } else if (foo == 20) {
        println("$foo is equal 20")
    } else
    /* we can omit curly braces if body - oneliner*/
        println("$foo is equal $foo")

    // ternary operator in python
    // result = true_body if condition else false_body
    // here's in kotlin
    val ternaryResult = if (foo == 21) 45 else "bar"
    println(ternaryResult)


}