/**
 * @author cho.oh 2018/06/22.
 */
//filterの使え方
val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
val result = spices.filter { it.contains("curry")}.sortedByDescending { it.length }
val result2 = spices.filter {it.startsWith('c') && it.endsWith('e')}
val result2_1 = spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
val result3 = spices.filter {it[0] == 'c' && it[it.length - 1] == 'e'}
val result4 = spices.take(3).filter { it.startsWith('c') }