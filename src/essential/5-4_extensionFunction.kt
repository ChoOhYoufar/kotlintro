package essential

/**
 * @author cho.oh 2018/07/27.
 */
//拡張関数、拡張プロパティ
//private fieldにアクセスできない

fun String.hasSpaces(): Boolean {
    //thisはStringのインスタンス
    val found = this.find{ it == ' '}
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null

fun extensionExample() {
    "Does it have space".hasSpaces() // true
}

fun main(args: Array<String>) {
    println(extensionExample())
}

//拡張関数でそんなに重要ではないmethodを表示する(helper, XXXUtil)
class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "Red"
//private fieldにアクセスできない
//エラーになる
//fun AquariumPlant.isBig() = size > 50

val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExample() {
    val plant = AquariumPlant("Green", 50)
    plant.isGreen //true
}