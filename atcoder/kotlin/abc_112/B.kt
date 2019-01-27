package kotlin.abc_112

/**
 * @author kojin15.
 */
fun main() {
    val (N, T) = readLine()!!.split(" ").map { it.toInt() }
    val a = (1..N).map {
        val (c, t) = readLine()!!.split(" ").map { it.toInt() }
        Pair(c, t)
    }.filter { it.second <= T }.sortedBy { it.first }
    println(if (a.isEmpty()) "TLE" else a[0].first)
}