package essential

/**
 * @author cho.oh 2018/07/27.
 */

// Collection
fun main(args: Array<String>) {
    //listでlistOfとmutableListOfがある
    //listOfは要素を追加、削除できない
    //mutableListOfは要素を追加、削除できる
    //multi-threadでよくlistOfを使う
    val symptoms = mutableListOf("white spots", "red", "A", "B", "C")
    val symptoms_ver1 = listOf("white spots", "red", "A", "B", "C")
    //エラーになる
    //symptoms_ver1.add("white fungus")

    //よく使うメソッド
    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red") // false
    symptoms.contains("red spots") // true

    println(symptoms.subList(4, symptoms.size)) // [C]

    listOf(1, 3, 5).sum() //9
    listOf("a", "b", "cc").sumBy { it.length } // 4
    println(symptoms)

    //Map
    //mapOfは要素を追加、削除できない
    //mutableMapOfは要素を追加、削除できる
    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")
    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")

    //keyからvalueを探す
    println(cures.get("white spots"))
    println(cures["white spots"])

    //keyがmapで見つからない場合、デフォルト値を設定できる
    println(cures.getOrDefault("bloating", "sorry I don't know"))

    //TODO
    cures.getOrElse("bloating") { "No cure for this" }
}