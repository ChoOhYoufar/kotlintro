package classes

/**
 * @author cho.oh 2018/07/27.
 */

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()