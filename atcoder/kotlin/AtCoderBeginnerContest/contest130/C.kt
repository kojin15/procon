package kotlin.AtCoderBeginnerContest.contest130

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (W, H, x, y) = readLine()!!.split(" ").map { it.toLong() }
    val S = W * H / 2.0
    val frag = x * 2 == W && y * 2 == H
    println("$S ${if (frag) 1 else 0}")
}