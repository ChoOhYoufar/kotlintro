package classes

/**
 * @author cho.oh 2018/07/06.
 */

//キーワードはinterface
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable") //デフォルト実装のあるメソッド
}

//: はjavaのextendsとimplementsを置き換え
class Button : Clickable {
    //override は必須
    override fun click() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

//interface abstract class
//abstract class はconstructorを持つ可能