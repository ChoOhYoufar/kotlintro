package functional_manipulation

/**
 * @author cho.oh 2018/07/27.
 */
//高階関数
//高階関数とその拡張ラムダ式はKotlinの一番advanceの部分

//with関数
//あるインスタンスに対する複数の操作をすっきり記述することが目的
//用途：インスタンスを生成し、各種設定を行ってから実際に使用するという場面

//withを使える前に
fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("now I know the alphabet")
    return result.toString()
}

//withを使える後
//fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
//最後の一行を返す
fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nnow I know the alphabet")
        this.toString()
    }
}

//apply
//fun <T> T.apply(block: T.() -> Unit): T { block(); return this }
//thisを返す
fun alphabet3() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nnow I know the alphabet")
}

fun main (args: Array<String>) {

    //String
    println(alphabet2().javaClass.name)
    //StringBuilder
    println(alphabet3().javaClass.name)

//    println(alphabet2())

//    println(alphabet3())
}



data class Fish (var name: String)

fun fishExamples() {
    val fish = Fish("splashy")

    with (fish.name) {
        capitalize()
    }
}