package basic

/**
 * @author cho.oh 西暦18/07/29.
 */

//関数、変数とよく使うオペレーター
fun main(args: Array<String>) {
    println("Hello, world!")

    val answer: Int = 42

    //型の宣言を省略できる
    val answer2 = 42
    val question = "hello world"

    //valはimmutable(不変)参照です。Javaのfinal変数に対応中る
    //varはmutable(変更可能)参照です
    //できるだけvalを使う
    val answer3 = 42
    var answer4 = 42

    //普通の変数にnullを入れると、エラーになっている
    //var rocks: Int = null

    //型の後ろに?をつけることで、この変数にnullへの参照をできる
    var marbles: Int? = null

    //?. 安全呼び出し演算子
    //値がnullでない場合、普通にメソッドを呼び出し
    //値がnullの場合、呼び出しをスキップされ、nullを返す
    fun printAllCaps(s: String?) {
        val allCaps: String? = s?.toUpperCase()
        println(allCaps)
    }
    //ABC
    printAllCaps("abc")
    //null
    printAllCaps(null)

    //?: エルビス演算子
    //?:前の値がnullでなければ結果はその値を返す
    //?:前の値がnullであれば結果は?:後ろの値を返す
    fun strLenSafe(s: String?) : Int = s?.length ?: 0
    //3
    println(strLenSafe("abc"))
    //0
    println(strLenSafe(null))

    //!! 非null表明
    //任意の値をnull非許容型に変換します
    //値がnullの場合は、例外がスローされます
    fun ignoreNulls(s: String?) {
        val sNotNull: Int = s!!.length
        println(sNotNull)
    }
    //NullPointerException
    ignoreNulls(null)
}