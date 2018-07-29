package function

/**
 * @author cho.oh 2018/06/22.
 */
//fun function.function.function.function.function.function.main(args: Array<String>) {
//    println(whatShouldIDoTodayBetter("happy", "sunny"))
//    println(whatShouldIDoTodayBetter("sad"))
//    print("How do you feel?")
//    println(whatShouldIDoTodayBetter(readLine()!!))
//}
//
//fun isVeryHot (temperature: Int) = temperature > 35
//fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
//        mood == "sad" && weather == "rainy" && temperature == 0
//fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
//fun whatShouldIDoTodayBetter(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
//    return when {
//        isVeryHot(temperature) -> "go swimming"
//        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
//        isHappySunny(mood, weather) -> "go for a walk"
//        else -> "Stay home and read."
//    }
//}

//fun function.function.function.function.function.function.main(args: Array<String>) {
//    var fortune: String = ""
//    repeat(10){
//        fortune = function.function.getFortune()
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }
//}

fun main(args: Array<String>) {
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getFortune() : String {
    val fortunes = listOf( "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends, because they are your greatest fortune.")
    print("\nEnter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}