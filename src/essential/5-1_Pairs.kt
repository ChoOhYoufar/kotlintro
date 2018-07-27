package essential

/**
 * @author cho.oh 2018/07/27.
 */

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
    println("Here is your book $triple1 written by $triple2 in $triple3")
}