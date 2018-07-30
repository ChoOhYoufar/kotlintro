package classes

/**
 * @author cho.oh 2018/07/06.
 */
//interfaceとabstract class
//interfaceとabstract classの違い
//abstract class はconstructorを持つ可能、interfaceはconstructorを持つ可能できない
//両方default実装を持つできる
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

//いろんなメソッドと一つ、二つdefault実装ある
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}


//使い方
abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark: AquariumFish(), FishAction {
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("munch on algae")
    }
}

//delegation
//TODO