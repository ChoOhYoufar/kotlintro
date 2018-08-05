package function

/**
 * @author cho.oh 西暦18/08/05.
 */
//The second will generate a random number every time random2 is accessed


//val rollDice = { Random().nextInt(12) + 1}
//val rollDice = { sides: Int ->
//    Random().nextInt(sides) + 1
//}
//val rollDice0 = { sides: Int ->
//    if (sides == 0) 0
//    else Random().nextInt(sides) + 1
//}
//val rollDice2: (Int) -> Int = { sides ->
//    if (sides == 0) 0
//    else Random().nextInt(sides) + 1
//}
//
//
////Function type notation is more readable, which reduces errors, clearly showing the what type is passed in and what type is returned.
//gamePlay(rollDice2(4))
//fun gamePlay(diceRoll: Int){
//    // do something with the dice roll
//    println(diceRoll)
//}