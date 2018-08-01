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
fun alphabet2(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("now I know the alphabet")
        this.toString()
    }
}



data class Fish (var name: String)

fun main (args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    with (fish.name) {
        capitalize()
    }
}

//apply

//run

//let