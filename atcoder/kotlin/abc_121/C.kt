package kotlin.abc_121

/**
 * @author kojin15.
 */
fun main(args: Array<String>) {
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val AB = (1..N).map { readLine()!!.split(" ").map { it.toLong() } }.sortedBy { it[0] }

    var c = 0L
    var t = M.toLong()
    for (i in 0 until N) {
        if (t == 0L) break
        val (a, b) = AB[i]
        c += a * Math.min(b, t)
        t = Math.max(t - b, 0)
    }
    println(c)
}