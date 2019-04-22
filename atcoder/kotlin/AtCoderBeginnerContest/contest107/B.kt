package kotlin.AtCoderBeginnerContest.contest107

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (H, W) = readLine()!!.split(" ").map { it.toInt() }
    val first = mutableListOf<String>()
    for (i in 1..H) {
        readLine()!!.let { if (it.any { c -> c == '#' }) first.add(it) }
    }

    val indexes = mutableListOf<Int>()
    for (j in 1..W) {
        if (first.map { it[j - 1] }.all { c -> c == '.' }) indexes.add(j - 1)
    }

    first.map { it.filterIndexed { index, c -> !indexes.contains(index) } }.forEach(::println)
}