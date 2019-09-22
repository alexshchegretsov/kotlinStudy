
fun main() {
    val c = 'a' // Char, single quotes
    val message = "Hello"  // String
    val m = message[0] // Char
    val to_byte_array = message.toByteArray() // just like encode() in Python
    val to_string = String(to_byte_array) // to string
    val name = "Alex"
    val yearOfBirth = 1989
    val yearNow = 2019
    val messageNew = "$name is ${yearNow - yearOfBirth} years old"
    println(messageNew)
}
