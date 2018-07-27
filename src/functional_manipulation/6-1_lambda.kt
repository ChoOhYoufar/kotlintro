package functional_manipulation

/**
 * @author cho.oh 2018/07/27.
 */

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST,
    START,
    END
}

class Game {
    var path = mutableListOf(Directions.START)
    val north = {() -> path.add(Directions.NORTH)}
    val south = {path.add(Directions.SOUTH)}
    val east = {path.add(Directions.EAST)}
    val west = {path.add(Directions.WEST)}
    val end = {() -> path.add(Directions.END)}
}

fun main(args: Array<String>) {
    val game: Game
    game.path
}