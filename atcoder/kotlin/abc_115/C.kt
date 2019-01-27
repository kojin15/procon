package kotlin.abc_115

/**
 * @author kojin15.
 */
fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val h = (1..N).map { readLine()!!.toInt() }.sorted()
    val d = mutableListOf<Int>()
    for (i in 0..(N - K)) {
        d.add(h[i + K - 1] - h[i])
    }
    println(d.min())
}