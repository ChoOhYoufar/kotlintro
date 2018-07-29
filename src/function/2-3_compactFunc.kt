package function

/**
 * @author cho.oh 西暦18/07/30.
 */
//kotlinizeな関数書き方
fun main(args: Array<String>) {
    println("Hello, world")
}


fun shouldChangeWater_ver1(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20): Boolean {
    //ここのwhenはif elseとして使っている
    //when中のロジックが多い
    //また判断の意味は不明
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" -> true
        else -> false
    }
}

fun shouldChangeWater_ver2(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20): Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"
    //意味あるstatementに書き換え
    return when {
        isTooHot -> true
        isDirty -> true
        isSunday -> true
        else -> false
    }
}

fun shouldChangeWater_ver3(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20): Boolean {

    //one line 関数で書き換え
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

