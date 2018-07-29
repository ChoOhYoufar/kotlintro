package function

/**
 * @author cho.oh 2018/06/22.
 */
fun main(args: Array<String>) {
    println(whatShouldIDoToday("sad"))
}
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read"
    }
}