package function

/**
 * @author cho.oh 西暦18/07/29.
 */
//デフォルト引数
fun main(args: Array<String>) {
    println("Hello, world")
}

//デフォルト引数の定義
fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20) {

}

//デフォルト引数の呼び出し
fun feedTheFish() {
    shouldChangeWater("Monday", 20, 50)
    shouldChangeWater("Monday")
    shouldChangeWater("Monday", dirty = 50)
}