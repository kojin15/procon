package kotlin.abc_113

/**
 * @author kojin15.
 */
fun main() {
    val N = readLine()!!.toInt()
    val (T, A) = readLine()!!.split(" ").map { it.toInt() }
    val base = A - T
    println(readLine()!!.split(" ")
        .mapIndexed { index, it -> Pair(base + it.toDouble() * 0.006, index) }
        .minBy { Math.abs(it.first) }!!.second + 1)
}