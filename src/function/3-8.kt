package function

import java.lang.Math.random

/**
 * @author cho.oh 2018/06/22.
 */

val random1 = random()
val random2 = {random()}

//function.getRandom1 has a value assigned at compile time, and the value never changes when the variable is accessed.
//
//function.getRandom2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.
