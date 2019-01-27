package kotlin.NIKKEI_2019

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val AB = (0 until N).map {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        a to b
    }.sortedByDescending { it.first + it.second }

    var s_a = 0L; var s_b = 0L
    for (i in 0 until N) when (i % 2) {
        0 -> s_a += AB[i].first
        1 -> s_b += AB[i].second
    }
    println(s_a - s_b)
}