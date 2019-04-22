package kotlin.AtCoderBeginnerContest.contest108

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (x1, y1, x2, y2) = readLine()!!.split(" ").map { it.toInt() }
    val nx = x2 - x1; val ny = y2 - y1
    println("${x2 - ny} ${y2 + nx} ${x1 - ny} ${y1 + nx}")
}