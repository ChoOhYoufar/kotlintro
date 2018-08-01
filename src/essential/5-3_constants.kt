package essential

/**
 * @author cho.oh 2018/07/27.
 */
//Constants

//constを使って、定数を定義する
//普通のvalに比べて、const valの値はcompile timeで決められた
//ただ、top-levelだけ定義できる（）
//top-levelはクラスの外の意味
val number = 5

const val num = 5

fun main(args: Array<String>) {
    println("Hello, world")
    //クラスの外ではないので、エラーになる
    //const val num2 = 5
    println(num)
}

//クラス内で定数を定義する場合、object内で定義する
//違いは普通のobjectは第一回目使う時作成される
//companion objectはobject作成する時作成される
object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class MyClass {
    companion object {
        const val CONSTANT3 = "constant"
    }
}