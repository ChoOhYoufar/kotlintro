package function

/**
 * @author cho.oh 西暦18/08/05.
 */
fun main(args: Array<String>) {
    println(whatShouldIDoToday1("happy", "sunny"))
    println(whatShouldIDoToday1("sad"))
    print("How do you feel?")
    println(whatShouldIDoToday1(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday1(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}

//fun main(args: Array<String>) {
//    var fortune: String = ""
//    repeat (10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }
//}
//
//fun main(args: Array<String>) {
//    var fortune: String = ""
//    while (!fortune.contains("Take it easy")) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//    }
//}
