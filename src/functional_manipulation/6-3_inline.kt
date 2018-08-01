package functional_manipulation

/**
 * @author cho.oh 2018/07/27.
 */
//インライン関数
//用途：高階関数を引数になる場合で使う
//まずこの例から説明する
data class Fish1 (var name: String)

fun main (args: Array<String>) {
    fishExamples1()
}

fun fishExamples1() {
    val fish = Fish1("splashy")

    //毎回myWithを呼び出す時に、無名クラスを作成してコンパイルされる
    //直接実行する関数より実行効率が低下
    myWith (fish.name) {
        capitalize()
    }

    //inlineなしの時、毎回myWithを呼び出す時objectを作れる
    //myWith実際の実行
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.capitalize()
        }
    })

    //inlineある時、objectは作れない
    //myWith1実際の実行
    fish.name.capitalize()
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

//関数をinlineで宣言すると、関数本体はインライン展開されます
//言い換えると、通常の呼び出しの代わりに、関数の呼び出される場所に関数の本体が直接置換されます。
inline fun myWith1(name: String, block: String.() -> Unit) {
    name.block()
}