package kotlin.AtCoderBeginnerContest.contest116

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (AB, BC, CA) = readLine()!!.split(" ").map { it.toInt() }
    println((AB * BC) / 2)
}