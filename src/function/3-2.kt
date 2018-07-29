package function

/**
 * @author cho.oh 2018/06/20.
 */
//Exercise: Greetings, Kotlin
//Create a function.function.function.function.function.function.main() function that takes an argument representing the time in 24-hour format (values between and including 0 -> 23).
//
//In the function.function.function.function.function.function.main() function, check if the time is before midday (<12), then print "Good morning, Kotlin"; otherwise, print "Good night, Kotlin".
//
//Notes:
//Remember that all function.function.function.function.function.function.main() function arguments are Strings, so you will have to convert this argument to an Int before you can apply the check.
//
//Advanced
//Try to use Kotlin's string templates to do this in 1 line.

//fun function.function.function.function.function.function.main(args: Array<String>) {
//    println("${if (args[0].toInt() < 12) "Good Morning Kotlin" else "Good Night Kotlin"}")
//}

fun main(args: Array<String>) {
    if (args[0].toInt() < 12) println("Good Morning Kotlin")
    else println("Good Night Kotlin" )
}