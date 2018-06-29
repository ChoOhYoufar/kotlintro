/**
 * @author cho.oh 2018/06/22.
 */
fun main(args: Array<String>) {
    canAddFish(10.0, listOf(3,3,3))
    canAddFish(8.0, listOf(2,2,2), hasDecorations = false)
    canAddFish(9.0, listOf(1,1,3), 3)
    canAddFish(10.0, listOf(), 7, true)
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) {
    val restTankSize = if (hasDecorations) tankSize * 0.8 else tankSize
    println(restTankSize - currentFish.sum() >= fishSize)
}