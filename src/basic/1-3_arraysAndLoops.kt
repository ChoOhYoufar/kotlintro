package basic

/**
 * @author cho.oh 西暦18/07/29.
 */
//List, array, for
fun main (args: Array<String>) {
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    val school = arrayOf("tuna", "salmon", "shark")

    val numbers = intArrayOf(1, 2, 3)

    //forループはJavaのものと似ていますが、
    //コレクションをインデックス付きで処理するときには特に便利になる
    val fish = 12
    val plants = 5
    val swarm = listOf(fish, plants)
    //125
    for (element in swarm) println (element)

    for ((index, element) in swarm.withIndex()) {
        //Fish at 0 is 12
        //Fish at 1 is 5
        print("Fish at $index is $element\n")
    }
}