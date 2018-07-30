package classes

/**
 * @author cho.oh 2018/07/06.
 */

//クラス可視性
// public(デフォルト) -> どこでも参照可能
// private -> クラス内からのみ参照可能
// protected -> サブクラスから参照可能
// internal -> モジュール内からのみ参照可能

fun main(args: Array<String>) {
    println("Hello, world")
}

// public(デフォルト) -> どこでも参照可能
fun buildAquarium_ver1() = println("build a aquarium")

// private -> ファイル内からのみ参照可能
private fun buildAquarium_ver2() = println("build a aquarium")

// private -> モジュール内からのみ参照可能
internal fun buildAquarium_ver4() = println("build a aquarium")

