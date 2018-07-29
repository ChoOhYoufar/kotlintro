package basic

/**
 * @author cho.oh 西暦18/07/29.
 */
//Stringとwhenの使え方
fun main (args: Array<String>) {

    //変数名の先頭に$を付けるか、式を${}で囲むことによって、その値を文字列に挿入できる
    val numberOfFish = 5
    val numberOfPlants = 12
    // I have 5 fish and 12 plants
    println("I have $numberOfFish fish and $numberOfPlants plants")

    //Javaのswitch文に似ているけど、switch文より使い方が多い
    fun whenTest(numberOfFish: Int) {
        return when (numberOfFish) {
            0 -> println("Empty tank")
            50 -> println("Full tank")
            else -> println("Perfect!")
        }
    }
}