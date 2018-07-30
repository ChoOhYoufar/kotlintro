package classes

/**
 * @author cho.oh 2018/07/27.
 */
// singleton, enum class, sealed class
//objectキーワードでシングルトンを定義する
//kotlinでobjectキーワードはいろんな使え方あるけど、基本はクラスの宣言と宣言したクラスのインスタンスの生成を同時に行うということ
object MobyDickWhale {
    val author = "Herman Melville"

    fun jump() {

    }
}


//enum キーワードで使う
//プロパティを持つできる
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//業務でよくwhenと一緒に使う
fun getMnemonic(color: Color) =
        when(color) {
            Color.RED -> "Richard"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Sam"
        }


//scalaのsealed abstract classに似ている、よくenumとして使う
//クラスの外側で定義されたクラスを継承先とすることはできない

sealed class Expr {
    //このファイル内だけでサブクラスを定義できる
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

//よくwhenと一緒に使う
sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}