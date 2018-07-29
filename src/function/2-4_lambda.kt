package function

/**
 * @author cho.oh 西暦18/07/30.
 */
//lambda入門とkotlin lambda書き方
fun main(args: Array<String>) {
    println("Hello, world")

    //lambdaは{}で定義する
    val swim = {println("swim \n")}
    // -> の左はargument, -> の右は関数内容
    var dirty = 20
    val waterFilter = {dirty: Int -> dirty / 2}
    val waterFilter_ver2 : (Int) -> Int = {dirty -> dirty / 2}
    waterFilter(dirty)
}

