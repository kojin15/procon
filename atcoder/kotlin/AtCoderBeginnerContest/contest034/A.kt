package kotlin.AtCoderBeginnerContest.contest034

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    println(readLine()!!.split(" ").map { it.toInt() }
        .let { if (it[0] < it[1]) "Better" else "Worse" })
}