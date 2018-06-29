import java.io.BufferedReader
import java.io.FileReader

/**
 * @author cho.oh 2018/06/21.
 */

//fun main(args: Array<String>) {
//////    dayOfWeek()
////    getFortuneCookie()
////}
////
////fun getFortuneCookie() {
////    val fortuneStr = listOf(
////            "You will have a great day!",
////            "Things will go well for you today.",
////            "Enjoy a wonderful day of success.",
////            "Be humble and all will turn out well.",
////            "Today is a good day for exercising restraint.",
////            "Take it easy and enjoy life!",
////            "Treasure your friends because they are your greatest fortune.")
////
////    println("Enter your birthday")
////
////    val fortune = when(readLine()!!.toIntOrNull()) {
////        in 1..5 -> fortuneStr[0]
////        in 6..10 -> fortuneStr[1]
////        in 11..15 -> fortuneStr[2]
////        in 15..20 -> fortuneStr[3]
////        in 21..25 -> fortuneStr[4]
////        in 25..30 -> fortuneStr[5]
////        else -> fortuneStr[6]
////    }
////    println(fortune)
////}

//fun main(args: Array<String>) {
//    println("\nYour fortune is: ${getFortune()}")
//}
//
//fun getFortune() : String {
//    val fortunes = listOf( "You will have a great day!",
//            "Things will go well for you today.",
//            "Enjoy a wonderful day of success.",
//            "Be humble and all will turn out well.",
//            "Today is a good day for exercising restraint.",
//            "Take it easy and enjoy life!",
//            "Treasure your friends, because they are your greatest fortune.")
//    print("\nEnter your birthday: ")
//    val birthday = readLine()?.toIntOrNull() ?: 1
//    return fortunes[birthday.rem(fortunes.size)]
//}
//
//fun main(args: Array<String>) {
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortune()
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }
//}

//whenの使え方

fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortuneStr = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    val index = when (birthday) {
        28, 31 -> 4
        in 1..7 -> 2
        else -> birthday.rem(fortuneStr.size)
    }

    return fortuneStr[index]
}