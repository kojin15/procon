package kotlin.AtCoderBeginnerContest.contest117

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = readLine()!!.split(" ").map { it.toInt() }.sortedDescending()
    println(if (L.sum() - 2 * L.first() > 0) "Yes" else "No")
}