// constant values
const val x = 2
const val y = "hi"
const val z = 3.65

fun main() {
    println("Hello man, i started study kotlin")

    /* read-only(assigned-once) local variables */
    val number = 42
    val message = "hello"
    println(number)
    println("again " + message)

    /* mutable local variables */
    var some_int = 42
    var some_str = "mutable string"
    some_int += 1
    some_str += " we are"
    println(some_int)
    println(some_str)
    println(x)
    println(y)
    println(z)
    println(x + z) // sum int and double
    /* Specifying the type explicitly */
    val characters: CharSequence = "abcd"
    println(characters[0])

}


