package essential

/**
 * @author cho.oh 2018/07/27.
 */
//Pair Triple
//Destructuring　同時に複数の変数を作る
//関数の返す値を複数にできる
//mapを

class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAndAuthor(title: String, author: String): Pair<String, String> {
        return Pair(title, author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {
    val book = Book("X", "Y", 1950)
    val (triple1, triple2, triple3) = book.getTitleAuthorYear()
    //triple, pairをStringに変換できる
    val titleAuthorYearStr = book.getTitleAuthorYear().toString()
    //triple, pairをListに変換できる
    val titleAuthorYearList = book.getTitleAuthorYear().toList()
    println("Here is your book $triple1 written by $triple2 in $triple3")
}